<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setMaxInactiveInterval(10*60); //10분동안임. 1은 1초.
	session.setAttribute("username","lulu"); //(세션 저장이름, 값)
	session.setAttribute("userage","14");
	
	response.sendRedirect("jsp021_session1.jsp");
%>