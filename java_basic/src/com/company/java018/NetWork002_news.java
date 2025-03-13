package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NetWork002_news {
	public static void main(String[] args) {
		
		try {
			//1  URL
			//	https://openapi.naver.com/v1/search/news.xml	XML
			//	https://openapi.naver.com/v1/search/news.json	JSON
			String apiurl = "https://openapi.naver.com/v1/search/news.json?query="
							+ URLEncoder.encode("ai", "UTF-8");
			URL url = new URL( apiurl );
			
			//2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//3. 요청설정
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "cBYvxVKpl2Az65nn0ipf");
			conn.setRequestProperty("X-Naver-Client-Secret", "_WeYtxTogc");
//			> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
//			> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			
			//4. 응답확인 - 200
			//System.out.println(conn.getResponseCode());
			int dode = conn.getResponseCode();
			BufferedReader br;
			if(dode==200){
				br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else {
				br=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			//5. 응답데이터 - xml / json / csv
			String line=""; StringBuffer sb = new StringBuffer();
			while( ( line=br.readLine() )!=null ) { sb.append(line + "\n"); }
			
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
			
			
		}catch(Exception e) {e.printStackTrace();}
		
		

		
		
	}//main
}//class
/* https://developers.naver.com/docs/serviceapi/search/book/book.md#%EC%B1%85
++ 1 ++
Client ID		cBYvxVKpl2Az65nn0ipf
Client Secret	_WeYtxTogc

++ 2 ++
https://openapi.naver.com/v1/search/news.xml	XML
https://openapi.naver.com/v1/search/news.json	JSON

++ 3 요청정보 ++
GET	쿼리 스트링 형식-요청사항을 주소표시창줄에 데이터 넣기(사과를 검색했을때 주소창에 어쩍저쩌구사과 나오게하는거)
query UTF-8로 인코딩
> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}



*/
