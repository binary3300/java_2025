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
 
 <!-- 메뉴판 -->
 <!-- 메뉴판 -->
 
 
	<div class="container card my-5">
	
	
		<h3 class="card-header text-bg-primary my-3">MILK MENU</h3>
		 
			<table class="table table-bordered table-striped my-5">
				<caption class="text-muted" > 우유 주문 현황 </caption>
			  <thead>
			    <tr>
			      <th scope="col" class="text-primary">NO</th>
			      <th scope="col" class="text-primary text-primary">NAME</th>
			      <th scope="col" class="text-primary text-primary">PRICE</th>
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
	
<!-- 주문현황 표-->
<!-- 주문현황 표-->
	
	<div class="container text-primary card my-5">
	<h3 class="card-header text-bg-primary my-3">MILK ORDER</h3>
	<table class="table table-striped table-bordered">
	<caption class="text-muted">Milk 주문 현황</caption>
    <thead>
      <tr>
        <th scope="col"class="text-primary">No</th>
        <th scope="col"class="text-primary">Name</th>
        <th scope="col"class="text-primary">Num</th>
        <th scope="col" class="text-primary">주문날짜</th>
      </tr>
    </thead>
    <tbody>
    <%
    //Connection conn = null; PreparedStatement pstmt = null; //ResultSet rset = null;  	values ('white',2,'127.0.0.1')
    //String 
    sql = "select * from milk_order order by ono desc";
    try{
    	//1 드라이버 연동
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	//2 데이터베이스 연동 -close();
    	conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mbasic", "root", "1234");
    	
    	//3 프리페어드 스텟먼트로 sql연동 최신주문이 위로 올라가게
    	pstmt = conn.prepareStatement(sql); //이게 다네 ㄱ-
    	
    	//4 결과값 받아서 처리
    	rset = pstmt.executeQuery(); //표
    	while(rset.next()){ //줄
    		out.println("<tr><td>"+rset.getInt("ono")
    					+"</td><td>"+ rset.getString("oname")
    					+"</td><td>"+rset.getInt("onum")
    					+"</td><td>"+rset.getString("odata")+"</td> </tr>");
    	}
    	
    }catch(Exception e){e.printStackTrace();
    }finally{
    	if(rset != null ){ rset.close();}
    	if(pstmt != null ){ pstmt.close();}
    	if(conn != null ){ conn.close();}
    }
    
    
    
    %>
    
    
      <!-- <tr>
        <td>+rset.getInt("ono")</td>
        <td>+rset.getString("oname")</td>
        <td>+rset.getInt("onum")</td>
        <td>+rset.getString("odate")+</td>
      </tr> -->
    </tbody>
  </table>
	</div>	
	
	<div class="container card my-5">
		<h3 class="card-header text-bg-primary my-3">Milk 주문하러 가기</h3>
		<div id="accordion">
<!-- 주문하기 -->
<!-- 주문하기 -->
			  <div class="card">
			    <div class="card-header">
			      <a class="btn text-primary" data-bs-toggle="collapse" href="#collapseOne" style="font-weight:bold;" >
			        주문하기
			      </a>
			    </div>
			    <div id="collapseOne" class="collapse show" data-bs-parent="#accordion">
			      <div class="card-body">
			        <!--  -->
			        <!-- action="처리"  milk.insert.jsp
			        	 method="방식"	데이터 노출안됨(post)
			        	 name 			oname, onum
			        	
			        -->
			        
					<form action="milk.insert.jsp" method="post">
					  <div class="mb-3 mt-3">
					    <label for="email" class="form-label" style="font-weight:bold;">주문할 우유 이름</label>
					    <input type="text" class="form-control" id="email" placeholder="주문하실 우유 이름을 적어주세요!" name="oname">
					  </div>
					  <div class="mb-3">
					    <label for="pwd" class="form-label" style="font-weight:bold;">주문할 우유 갯수</label>
					    <input type="number" class="form-control" id="pwd" placeholder="주문할 갯수를 적어주세요" name="onum">
					  </div>
					  <button type="submit" class="btn btn-primary" style="font-weight:bold;">주문하기</button>
					</form>
			        
			        <!--  -->
			        <!--  -->
			      </div>
			    </div>
			  </div>
			  	
			  	
<!-- 주문수정 -->
<!-- 주문수정 -->
	
			  <div class="card">
			    <div class="card-header">
			      <a class="collapsed btn text-primary" data-bs-toggle="collapse" href="#collapseTwo" style="font-weight:bold;">
			        주문수정
			      </a>
			    </div>
			    <div id="collapseTwo" class="collapse" data-bs-parent="#accordion">
			      <div class="card-body">
			        <!--  -->
			        <!--  -->
			        <!-- action=	milk_update.jsp
			        	 method=	post
			        	 name  		ono, oname, onum		-->
			        <!--  -->			        
			        
					<form action="milk_update.jsp" method="post">
					  <div class="mb-3 mt-3">
					    <label for="ono_update" class="form-label">수정 주문번호</label>
					    <input type="number" class="form-control" id="ono_update" placeholder="수정하실 주문번호을 적어주세요!" name="ono">
					  </div>
					  <div class="mb-3 mt-3">
					    <label for="oname_update" class="form-label" style="font-weight:bold;">수정 우유 이름</label>
					    <input type="text" class="form-control" id="oname_update" placeholder="수정하실 우유 이름을 적어주세요!" name="oname">
					  </div>
					  <div class="mb-3">
					    <label for="onum_update" class="form-label" style="font-weight:bold;">수정할 우유 갯수</label>
					    <input type="number" class="form-control" id="onum_update" placeholder="수정할 갯수를 적어주세요" name="onum">
					  </div>
					  <button type="submit" class="btn btn-primary">주문하기</button>
					</form>
					
			        <!--  -->
			        <!--  -->
			        <!--  -->
			        <!--  -->	
					
			      </div>
			    </div>
			  </div>
			  
			  	
<!-- 주문삭제 -->
<!-- 주문삭제 -->
	
			  <div class="card">
			    <div class="card-header">
			      <a class="collapsed btn text-primary" data-bs-toggle="collapse" href="#collapseThree" style="font-weight:bold;">
			        주문삭제
			      </a>
			    </div>
			    <div id="collapseThree" class="collapse" data-bs-parent="#accordion">
			      <div class="card-body">
			        <!--  -->
			        <!--  -->
			        <!-- action=	milk_delete.jsp
			        	 method=	get
			        	 name  		ono	-->
			        <!--  -->
					<form action="milk_delete.jsp" method="get">
					  <div class="mb-3 mt-3">
					    <label for="ono_delete" class="form-label">주문할 우유 이름</label>
					    <input type="number" class="form-control" id="ono_delete" placeholder="취소하실 주문 번호를 적어주세요!" name="ono">
					  </div>

					  <button type="submit" class="btn btn-primary">주문하기</button>
					</form>
			      </div>
			    </div>
			  </div>
		
		</div>
	</div>	
	
	
	</body>
	
	
	
	
	
</html>
