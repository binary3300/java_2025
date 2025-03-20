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
		<h3 class="card-header">FORM-SCORE</h3>
		<% //request.getParameter는 String만 담는다........
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int math = Integer.parseInt(request.getParameter("math"));
			int total = kor + eng + math;
			String avg = String.format( "%.2f",total/3.0 );
		
			//String kor = request.getParameter("kor");
			//String eng = request.getParameter("eng");
			//String math = request.getParameter("math");
			//Integer(kor);
			//int ch = kor+eng+math;
			//int py = ch/3;
		%>
	<table class="table table-bordered table-striped table-hover my-5">
		<caption>성적처리</caption>
	    <thead>
	      <tr>
	        <th scope="col">국어</th>
	        <th scope="col">영어</th>
	        <th scope="col">수학</th>
	        <th scope="col">총점</th>
	        <th scope="col">평균</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td><%= kor %></td>
	        <td><%= eng %></td>
	        <td><%= math %></td>
	        <td><%= total %></td>
	        <td><%= avg %></td>
	
	      </tr>
	     
	    </tbody>
	</table>
		
	</div>
	

</body>
</html>
