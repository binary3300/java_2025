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
		<h3 class="card-header"> 클라이언트측(브라우저)에 저장되는 정보! </h3>
		<table class="table table-striped table-bordered table-hover">
			<caption>cookie 상태확인</caption>
			<tbody>
			<% //1. 쿠키가 설정되어있는지 확인
				String cookie = request.getHeader("Cookie");
				out.println(cookie); 
				//JSESSIONID=5B26334B8DA0F70CC27BCBB29CC1F8DF
				//Tomcat이 session을 유지하기 위한 발급키
			   //2. 쿠키 가져오기 - 2.jsp쿠키저장 new Cookie("key1", "value1")
			   if(cookie != null){
				   Cookie[] cookies = request.getCookies();
				   for(Cookie c : cookies){
					   out.println("<tr><td>"+c.getName()
					   				+"</td><td>"+c.getValue()+"</td></tr>");
				   }
			   } 
			
			%>
			</tbody>
		</table>
		
		<div>
			<a href="jsp020_cookie2.jsp" class="btn btn-primary">쿠키저장</a>
			<a href="jsp020_cookie3.jsp" class="btn btn-primary">쿠키삭제</a>
		</div>
	</div>
	</body>
</html>
