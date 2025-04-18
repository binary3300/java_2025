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
		<div class="my-5"> <%= session.getAttribute("username") %> </div>
		
		<h3 class="card-header">FORM-LOGIN</h3>
		<p style="text-align:Center" ><img src="images/login.png"  /></p>
		
		<form action="jsp022_form_login_action.jsp" method="post" onsubmit="return form()"> 
			<div class="my-3">
				<label for="name" class="form-lable">Email</label>
				<input type="text" class="form-control" id="name" name="name" placeholder="아이디를 기입해주세요">
			</div>
			<div class="my-3">
				<label for="password" class="form-lable">Password</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="패스워드를 기입해주세요">
			</div>
			<div class="form-check mb-3">
			<label class="form-check-label">
			<input class="form-check-input" type="checkbox" name="remember"> 아이디 기억하기
			</label>
			</div>
			<div class="my-3 text-end">
			<button type="submit" title="Login 하러가기" class="btn btn-primary m-3" >Login</button>
			</div>
		</form>
		
		<script>
		function form(){
			let username = document.querySelector("#name");
			let password = document.querySelector("#password");
			//console.log(name.value);
			//console.log(password.value);
			
			if(username.value == ""){
				alert("이메일을 입력해주세요"); username.focus(); return false;
			}
			if(password.value == ""){
				alert("패스워드를 입력해주세요"); password.focus(); return false;
			}
		}
		
		</script>
		
		
	</div>
</body>
</html>
