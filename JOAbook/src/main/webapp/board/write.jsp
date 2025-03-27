<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
<!-- header -->
<!-- header -->
<!-- header -->
<!-- header -->
<body>
	<div class="container mt-3">
		<h2 style="text-align:center">MULTIBOARD 글쓰기</h2>
  		<h4>WRITE(CREATE)</h4>  
		<form action="" method="post" id="writeForm" onsubmit="return form()">
		  <div class="mb-3 mt-3">
		    <label for="bname" class="form-label">이름</label>
		    <input type="text" class="bname" id="bname" placeholder="이름을 입력해주세요" name="bname">
		  </div>
		  <div class="my-3">
		    <label for="btitle" class="form-label">제목</label>
		    <input type="text" class="btitle" id="btitle" placeholder="제목은 필수입니다" name="btitle">
		  </div>
		  <div class="my-3">
		 	 <label for="bcontent">내용</label>
		  	 <textarea class="form-control" cols="60"  rows="10"   id="bcontent" name="bcontent"></textarea>
		  </div>
		  <div class="d-grid gap-3 p-3">
		  <button type="submit" class="btn btn-primary btn-block">등록</button>
		  <button type="button" class="btn btn-outline-primary btn-block">취소</button>
		  <button type="button" class="btn btn-outline-primary btn-block">목록보기</button>
		  </div>
		</form>
		
		 <form action="" method="post" id="writeForm" onsubmit="return form()">
		  <div class="mb-3 mt-3">
		    <label for="text">Email:</label>
		    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
		  </div>
		  <div class="mb-3">
		    <label for="pwd">Password:</label>
		    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
		  </div>
		  <div class="form-check mb-3">
		    <label class="form-check-label">
		      <input class="form-check-input" type="checkbox" name="remember"> Remember me
		    </label>
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
		
		
		<script>
		function(){
			let bname = document.getElementById("bname");
			let btitle = document.getElementById("btitle");
			let bcontent = document.getElementById("bcontent");
			
			if(bname.value ==""){alert("빈칸입니다");   bname.focus();  return false; }
			if(btitle.value ==""){alert("빈칸입니다");   btitle.focus();  return false; }
			if(bcontent.value ==""){alert("빈칸입니다");   bcontent.focus();  return false; }
		}
		
		</script>
		
	</div>
<!-- footer -->
<!-- footer -->
<!-- footer -->
<!-- footer -->
<%@include file="../inc/footer.jsp" %>
