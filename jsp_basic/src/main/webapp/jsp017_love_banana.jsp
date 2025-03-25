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
		<h3 class="card-header"></h3>
		<% 
		String username = request.getParameter("username");
		String frut = request.getParameter("fruit");
		String btn = frut.equals("APPLE")? "btn-danger"
					:frut.equals("BANANA")? "btn-warning"
					: "btn-success";
		%>
		
		<table class="table table-striped" >
			<caption> select 데이터 확인 </caption>
			<tbody>
				<tr><th scope="row"> USER </th><td> <%= username %> </td></tr>
				<tr><th scope="row"> CHECK </th><td>
					<img src="images/<%=frut%>.jpg" alt="<%=frut%>사진">
				</td></tr>
			</tbody>
		</table>
		<a href="jsp017_Fruit.jsp" class="btn <%= btn%>"> 돌아가기 </a>
		
	</div>
	</body>
</html>
