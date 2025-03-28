package com.company.utill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/books")
public class NaverBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public NaverBookServlet() { super();  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/thml; charset=UTF-8");
		
		try {
			//1  URL
//			https://openapi.naver.com/v1/search/book.xml	XML
//			https://openapi.naver.com/v1/search/book.json	JSON
			String apiurl = "https://openapi.naver.com/v1/search/book.json?query="
							+  URLEncoder.encode("소년이온다", "UTF-8");
			URL url = new URL(apiurl);
			
			
			//2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			//3. 요청설정
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "cBYvxVKpl2Az65nn0ipf");
			conn.setRequestProperty("X-Naver-Client-Secret", "_WeYtxTogc");
			
			
			
			//4. 응답확인 - 200
			//System.out.println(conn.getResponseCode());  //200나왔디!!
			int res = conn.getResponseCode(); //문제가 여기였다! getResponseCode를 써야하는데 timeout을 써버렸지뭐야~~ 오류코드는 37번줄에 있다고 가리켰는데 진짜문제는 여기였삼!
			BufferedReader br;
			if(res==200) {
				br = new BufferedReader( new InputStreamReader(conn.getInputStream()));
			}else {
				br=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			//5. 응답데이터 - xml / json / csv
			String line=""; StringBuffer sb = new StringBuffer();
			while( (line=br.readLine())!=null ) {sb.append(line + "\n");}
			
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
			
			PrintWriter out = response.getWriter();
			out.println(sb.toString());
			
		} catch (Exception e) {e.printStackTrace();}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
