<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//jsp022_form_logout.jsp
	//1 session 초기화코드
	//2 form_login_2 페이지로 넘어가기 10초뒤 넘어갑니다 안내
	session.invalidate();
	//버전1 out.println("<script>alert('로그아웃합니다.'); location.href='jsp022_form_login_2.jsp';</script>");
	//버전2  >out.println("<script>alert('로그아웃합니다.');</script>");
	//버전2 response.sendRedirect("jsp022_form_login_2.jsp"); //이걸 쓰면 >알림창을 무시하고 바로 보내버림
	
	//버전3 새로고침	  http-equiv='refresh' 새로고침	content='초;' url='경로'
	out.println("<meta http-equiv='refresh' content='5;' url='jsp022_form_login_2.jsp' /> ");
	
	// >>> sendRedirect  (request, response 유지안됨)
	// request.getRequestDispatcher("jsp022_form_login_my.jsp").forward(request, response);
	//

%>