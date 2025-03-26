<%@page import="jsp_basic.DBManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Connection conn 	=  null;
	DBManager db = new DBManager();
	conn = db.getConnection();
	if(conn != null){out.println("db 연동성공!");}
%>

</body>
</html>
