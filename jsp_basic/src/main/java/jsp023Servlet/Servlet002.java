package jsp023Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet002
 */
//테스트용도
//컨트롤 f11해보면 Served at: /jsp_basic 라고 뜬다
//주소창에는 http://localhost:8080/jsp_basic/Servlet002  주소가 그대로 뜬다 
@WebServlet("/Servlet002")
public class Servlet002 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Servlet002() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
