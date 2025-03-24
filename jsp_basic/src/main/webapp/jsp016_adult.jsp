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
		<h3 class="card-header text-white bg-danger"><%= request.getParameter("userage") %> 어서오세요, 고객님 반갑습니다! </h3>
		<p class="alert alert-danger"> 님은 너무 오래살았네요 빨리 관짝에 들어가세요 </p>
		<p><a href="javascript:history.go(-1)" class="btm btn-success"> 돌아가기 </a></p>
		
		
		
		
	</div>
	</body>
</html>
