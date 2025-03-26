package jsp023Servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet003
 */
//컨트롤 + f11로 실햏ㅇ하면
//주소표시창에 http://localhost:8080/jsp_basic/hello 라고뜬다 
@WebServlet("/hello")
public class Servlet003 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int iniyCnt = 1;
	int doGetCnt = 1;
	int destroyCnt = 1;

    public Servlet003() { super();  }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("#1. init() 첫 요청에만 호출 > " + iniyCnt++);
	}

	public void destroy() {
		System.out.println("파일 조금 수정하고 저장해야 뜬다");
		System.out.println("#3. destroy() 맨 마지막에만 호출 > " + destroyCnt++);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#2-1. Get " + doGetCnt++);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#2-2. Post ");
	}

}
