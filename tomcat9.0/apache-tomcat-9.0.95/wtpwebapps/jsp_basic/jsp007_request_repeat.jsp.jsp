<%@page import="java.util.Calendar"%>
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
	<div class = "container card my-5">
		<h3> 복습문제 구글서치 </h3>
			<form action="https://www.google.com/search" method="get">
				<div class="my-3">
					<label for="query" class="form-lable"> 검색어 </label>
					<input type="text" class="form-control" id="query" name="q"/>
					<button type="submit" class="btn btn-danger"> 검색 </button>
				</div>
			</form>
	
	</div>
	

</body>
</html>
