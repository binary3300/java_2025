<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>project_mvc1_milk</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<!-- 
project_mvc1_milk 라는 dynamic web project 만들기
	이클립스 처음 들어와서 새 패일 만들때 class나 package 검색하고 만드는것처럼 dynamic web project도 다이나믹웹프로젝트라는 피일을 찾아서 만든다.
	거기서 체크박스 두개 확인한다.

서버설정
	아몰라 어캐함 이게뭔지도모름 걍함 다까먹음 맛있음
	일단 실행해봐

고양이화면 띄우기
	대충 서버창에 빨간글자 지나가고 된거같으면 인터넷브라우저에 http://localhost:8080/ 쳐서 들어가
	고양이가 이걸 보고있으면 잘 연결된거야! 라는뜼

jsp 템플릿 설정하기
	jsp파일 만들때 내가 추가한 myyyyyy그거

jdbc 연동하고 db 연동성공 출력
	여기서 < % % >  안에 써둔 Connection conn = null;랑
	try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
				if(conn != null){out.println("db연동성공!");}
				}catch(Exception e){e.printStackTrace();
				}finally{if(conn!=null){conn.close();}
			}
			
	트라이캐치로 연결하시고 되면 이거 출력하세요. 안되면 오류 알아서 처리하세요. 그리고 서버 잘 닫아두세요.
	라고 명령내려서 실행했을때 콘솔창에 db연동성공!라고 나오면 잘 된거임 


 -->

<body>
	<div class="container card my-5">
		<h3 class="card-header">DB연동</h3>
		<pre class="alert alert-warning">
			1. 드라이버연동 Class.forName
			2. db연동 	 DriverManager.getConnection
		
		</pre>
		
		<%
			Connection conn = null;
			try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/mbasic", "root", "1234");
					if(conn != null){out.println("db연동성공!");}
				}catch(Exception e){e.printStackTrace();
				}finally{
					if(conn!=null){conn.close();}
			}
			
		%>
	
	</div>
	

</body>
</html>
