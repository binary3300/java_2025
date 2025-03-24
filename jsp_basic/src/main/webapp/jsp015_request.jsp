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
		<h3 class="card-header bg-primary "> 내장객체 </h3>
		<div>
			<pre>
				1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될 때
				2. 고정된 이름의 객체 컨테이너로 자동으로 구현
				3. request(요청), response(응답), session(정보저장), out(출력)
			</pre> 
		</div><!-- 내장객체 안내 -->
	</div>	
	
	<div class="container card my-5">
		<h3 class="card-header bg-primary "> request </h3>
		<pre>
		1. action = "처리컴포넌트"
		2. method = "처리방식"
		3. name = "사용자가 입력한 값 보관하는곳 이름"
		</pre>
		<!-- http://localhost:8080/jsp_basic/j%20sp015_checkbox.jsp?username=d&option1=dog&option1=cat -->
		<form action="jsp015_checkbox.jsp" method = "get" onsubmit="return checkbox()">
			<div class="mb-3 mt-3">
				<label for="username" class="form-label">Name:</label>
				<input type="text" class="form-control" id="username" placeholder="Enter email" name="username">
			</div><!-- user name -->
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="check1" name="option1" value="dog">
				<label class="form-check-label" for="check1">Dog</label>
			</div><!--  -->
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="check2" name="option1" value="cat">
				<label class="form-check-label" for="check2">Cat</label>
			</div><!--  -->
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="check3" name="option1" value="ham">
				<label class="form-check-label" for="check3">Hamster</label>
			</div><!--  -->
			<div class="my-3">
				<button type="submit" class="bg-primary" >전송</button>
			</div>
		</form>
		<script>
			//빈칸검사......
			function checkbox(){
				let username = document.getElementById("username");
				let checkboxs = document.querySelectorAll(".form-check-input:checked");
				console.log(username);
				console.log(checkboxs);
				console.log(checkboxs.length);
			
				if(username.value == ""){
					alert("빈칸입니다"); username.focus(); return false;
				}
				if(checkboxs.length == 0){
					alert("체크박스를 한개 이상은 체크하셔야합니다."); return false;
				}
				
			}
			
			
		</script>
		
	</div>
		
	<div class="container card my-5">
		<h3 class="card-header bg-primary "> request </h3>
			<form action="jsp015_radio.jsp" method = "get" onsubmit="return check2()">
				<div class="mb-3 mt-3">
					<label for="username1" class="form-label">Name:</label>
					<input type="text" class="form-control" id="username1" placeholder="사용자 이름을 적어주세요" name="username">
				</div>
				<!-- user name -->
				<!-- radio -->
				<div class="form-check">
					  <input type="radio" class="form-check-input1" id="radio1" style="margin-right:10px" name="optradio" value="yes" checked>Yes
					  <label class="form-check-label" for="radio1"></label>
				</div>
				<div class="form-check">
					  <input type="radio" class="form-check-input1" id="radio2" style="margin-right:10px" name="optradio" value="no">No
					  <label class="form-check-label" for="radio2"></label>
				</div>
				<div class="form-check">
					  <input type="radio" class="form-check-input1" style="margin-right:10px" disabled>사용못함
					  <label class="form-check-label"></label>
				</div><!--  radio  -->
				<div class="my-3">
						<button type="submit" class="bg-primary" >전송</button>
				</div>
			</form>
			<script>
				function check2() {
					//alert("asdf");return false;
					// querySelector  #username1
					//querySelectorAll .form-check-input1
					
					let username1 = document.querySelector("#username1");
					let radios = document.querySelectorAll(".form-check-input1:checked");
					console.log(radios.length);
					//return false;
					if(username1.value ==""){
						alert("빈칸입니다."); username1.focus(); return false;
					}
					if(radios.length ==0){
						alert("선택은 1개 이상입니다.");return false;
					}
				}
			</script>
	</div><!--  end radio  -->
	
	<div class="container card my-5">
		<h3 class="card-header bg-primary "> request </h3>
	
<!--  -->
<!--  -->
		<form action="jsp015_select.jsp" method = "get" onsubmit="return check3()">
			<div class="mb-3 mt-3">
				<label for="username3" class="form-label">Name:</label>
				<input type="text" class="form-control" id="username3" placeholder="사용자 이름을 적어주세요" name="username">
			</div>

			<label for="color">COLOR 선택: </label>
			<div class="my-3">
			<select class="form-select" id="color" name="color">
			  <option value="bg-danger" >red</option>
			  <option value="bg-success">green</option>
			  <option value="bg-primary">blue</option>
			  <option value="bg-dark">dark</option>
			</select>
			<button type="submit" class="bg-primary" >전송</button>
			</div>
			
		</form>
		<script>
		function check3(){
			let username3 = document.querySelector("#username3");
			let color 	  = document.querySelector("#color > option:checked");
			console.log(color.value);
			
			if(username3.value == ""){
				alert("이름을 입력해주세요"); username3.focus(); return false;
			}
			if(color.value == ""){
				alert("색깔을 하나 선택해주세요"); color.focus(); return false;
			}
		}
		
		</script>
		
		
		</div>	
<!--  -->
<!--  -->
			
	</body>
</html>
