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
		<h3 class="card-header p-3">SELECT BOX</h3>
		<h4 class="p-3">좋아하는 과일 선택</h4>
		<hr>
		<form action="jsp017_love_banana.jsp" method = "get" onsubmit="return select()">
			<div class="mb-3 mt-3">
				<label for="username" class="form-label">사용자이름</label>
				<input type="text" class="form-control" id="username" placeholder="이름을 적어주세요" name="username">
			</div>

			<label for="fruit">좋아하는 과일 선택</label>
			<div class="my-3">
			<select class="form-select" id="fruit" name="fruit">
			  <option value="" >-- 선택 --</option>
			  <option value="apple" >APPLE</option>
			  <option value="banana">BANANA</option>
			  <option value="coconut">COCONUT</option>
			</select>
			<br>
				<div class="d-grid">
				<button type="submit" class="btn btn-primary btn-block" >수신체크 하러가기</button>
				</div>
			</div>
			
		</form>
		<script>
		function select(){
			let username = document.querySelector("#username");
			let fruit 	  = document.querySelector("#fruit option:checked");
			console.log(fruit.value);
			
			if(username.value == ""){
				alert("이름을 입력해주세요"); username.focus(); return false;
			}
			if(fruit.value == ""){
				alert("과일을 하나 선택해주세요"); return false;
			}
		}
		
		</script>
		
	</div>
	</body>
</html>
