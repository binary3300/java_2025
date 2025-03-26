<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp022_form_login_2.jsp -->
<!-- jsp022_form_login_2.jsp -->
<%@ include file="jsp025_header.jsp" %>
<!--  navbar  -->
<!--  navbar  -->

<!-- user_login		서블릿 만들기 -->
<!-- jsp025_login.jsp -->
<div class="container card my-5">
	<h3 class="card-header">LOGIN</h3>
	<p style="text-align:Center" ><img src="images/login.png" alt="로그인 이미지"  ></p>
	
	<form action="<%=request.getContextPath() %>/user_login" method="post" onsubmit="return form()"> 
		<div class="my-3">
			<label for="name" class="form-lable">Email</label>
			<input type="text" class="form-control" id="name" name="name" placeholder="아이디를 기입해주세요">
		</div>
		<div class="my-3">
			<label for="pass" class="form-lable">Password</label>
			<input type="password" class="form-control" id="pass" name="pass" placeholder="패스워드를 기입해주세요">
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
<!-- jsp022_form_login_2.jsp -->
<!-- jsp022_form_login_2.jsp -->	

<!-- jsp022_form_footer.jsp -->
<!-- jsp022_form_footer.jsp -->
<%@ include file="jsp025_footer.jsp" %>