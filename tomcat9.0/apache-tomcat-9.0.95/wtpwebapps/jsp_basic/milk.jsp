<%@page import="java.sql.*"%>
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
<div class="mt-4 p-5 bg-primary text-white rounded">
  <h1>MILK ORDER Project</h1>
  <p>Prepared Statement...also we serve nice and beautiful spaghetti</p>
</div>
<!-- 
부트스트랩5에서 공통적으로 쓰는 색깔 종류,, , , , ,
bg-primary
bg-danger
bg-warning
bg-dark
bg-info
bg-secondary
 -->
	<div class="container card my-5">
		<h3 class="card-header">MILK ORDER</h3>
		
			<table class="table table-bordered table-striped my-5 table-primary">
				<caption> 우유 주문 현황 </caption>
			  <thead>
			    <tr>
			      <th scope="col">NO</th>
			      <th scope="col">NAME</th>
			      <th scope="col">PRICE</th>
			    </tr>
			  </thead>
			  <tbody>
			    
		<%
		// project mvc1
		// select * from milk; -PreparedStatement
		Connection conn = null; PreparedStatement pstmt = null; ResultSet rset = null;
		String sql = "select * from milk;";
		String url = "jdbc:mysql://localhost:3306/mbasic";
		String id = "root", pass = "1234";
		
		try{
			//1 드라이버 연동....드라이버 여기 있어
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2 db연동....드라이버에 이 주소랑 아이디 비번으로 들어가
			conn = DriverManager.getConnection(
					url , id, pass
					/*String url = "jdbc:mysql://localhost:3306/mbasic";
						String id = "root", pass = "1234";*/);
			
			pstmt = conn.prepareStatement(sql 
					/*String sql = "select * from milk;";*/);
			rset = pstmt.executeQuery(); //select 표
			while(rset.next()){
				//out.println(rset.getInt("mno")+"/"+rset.getString("mname")+"/"+rset.getInt("mprice")+"<br/>");
					int mno=rset.getInt("mno");
					String mname = rset.getString("mname");
					int mprice = rset.getInt("mprice");
		%>
				<tr>
			      <td><%= mno %></td>
			      <td><%= mname %></td>
			      <td><%= mprice %></td>
			    </tr>

		
		<%	
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(rset!=null){rset.close();}
			if(pstmt!=null){pstmt.close();}
			if(conn!=null){conn.close();}
		}
		
		%>
			</tbody>
		</table>
		
	</div>
	</body>
</html>
