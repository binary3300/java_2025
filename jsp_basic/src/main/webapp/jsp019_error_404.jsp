<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<% response.setStatus(200); %>
<!-- 위에 두줄 중요~~!!!!! -->
<!-- 위에 두줄 중요~~!!!!! -->
<!-- 위에 두줄 중요~~!!!!! -->
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script>
window.onload=function(){ //브라우저가.로딩되면 =처리해주세요 {여기부터여기까지}
	let result = document.querySelector(".result");
	console.log(result);
	window.setTimeout(()=>{ 
		//console.log("...10초뒤 실행"); 
		location.href='jsp019_error.jsp'
		}, 10000 );
}
</script>
</head>
<body>
	<div class="container card bg-primary my-5">
		<h3 class="card-header text-white"> ERROR 404 </h3>
		<p class="text-center bg-white p-3">
			<img src="images/error.png" alt="" /></p>
		<p class="text-center p-3 text-white result">요청하신 페이지가 없습니다. 관리자에게 문의바랍니다.</p>

		
		
	</div>
	</body>
</html>
