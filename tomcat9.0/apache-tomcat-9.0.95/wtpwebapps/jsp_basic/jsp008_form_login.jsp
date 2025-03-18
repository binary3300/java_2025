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
		<h3 class="card-header">LOGIN</h3>
		<pre>
		1. action 	 : jsp008_form_login_result.jsp
		2. method 	 : get
		3. 입력보관이름 : email / pass / remember
		</pre>
		<!-- 사진을 중앙으로 하고싶을때 기억하기: 사진도 인라인요소라서 텍스트처럼 가능 -->
		<p style="text-align:Center" ><img src="images/login.png"  /></p>
		
		<form action="jsp008_form_login_result.jsp" method="get"> 
			<div class="my-3">
				<label for="email" class="form-lable">Email</label>
				<input type="email" class="form-control" id="email" name="email" >
			</div>
			<div class="my-3">
				<label for="pass" class="form-lable">Password</label>
				<input type="password" class="form-control" id="pass" name="pass" >
			</div>
			<div class="my-3">
				<label for="check" class="form-check mb-3">Remember</label>
				<input class="form-check-input" type="check" name="remember"> 아이디 비밀번호 저장
			</div>
			<div class="my-3">
				<input type="submit" title="login 하러가기" class="btn btn-danger" id="check"name="remember"/>
			</div>
		</form>
		
		
		
	</div>
</body>
</html>
