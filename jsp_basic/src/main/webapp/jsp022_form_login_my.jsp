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
	<div class="my-5"> <%= session.getAttribute("username") %> </div>
	<div class="container card my-5">
	<table class="table table-striped" >
		<caption> My data </caption>
		<tbody>
			<tr><th scope="row"> NO </th><td> </td></tr>
			<tr><th scope="row"> NAME </th><td> </td></tr>
			<tr><th scope="row"> PASS </th><td> </td></tr>
		</tbody>
	</table>
	
	
	</div>
	

</body>
</html>
