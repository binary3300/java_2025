<%@page import="jsp023Servlet.Servlet001"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header"> 001. Servlet </h3>
		<pre class="alert alert-primary my-3">
		1. 	.java
		2. java thread 이용해서 동작
		3. mvc패턴에서 controller역할 / Controller(servlet/java)
		</pre>
		
		<h5 class="card-header">1. java class 부품객체 사용</h5>
		<pre class="alert alert-primary my-3">
		<%
		Servlet001 basic = new Servlet001(10,20); //컨트롤+스페이스
		out.println(basic.getA());
		%>
		</pre>
		
		<h5 class="card-header">2. servlet		get/post </h5>
		<pre class="alert alert-primary my-3">
		예제) Servlet002
		1. web.xml servlet controller 등록 - 배포관리
		2. @WebServlet("/Servlet002")	테스트용
		</pre>
	</div>
	</body>
</html>
