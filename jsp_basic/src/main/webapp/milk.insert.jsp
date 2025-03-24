<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//1 utf-8 설정
	request.setCharacterEncoding("UTF-8");


//2 request.getParameter() 이용해서 데이터 받기
	String oname = request.getParameter("oname");
	int onum = Integer.parseInt( request.getParameter("onum") );
	

	//out.println(oname + "/" +onum);
	
	Connection conn = null; PreparedStatement pstmt = null; //ResultSet rset = null;  	values ('white',2,'127.0.0.1')
	String sql = "insert into milk_order (oname, onum, oip) values (?,?,?);";
	%>
      <script>
     	function form(){
     		let oname = document.querySelector("#oname");
     		let onum = document.querySelector("#onum");
     		
     		if(oname.value == ""){alert("구매하실 우유의 이름을 작성해주세요!"); oname.focus(); return false;}
     		if(onum.value == ""){alert("구매하실 수량을 입력해주세요!"); onum.focus(); return false;}
     		
     	}
     
     
     </script>
	
	<% %>
	
	try{
			//3 Driver 연동
			Class.forName("com.mysql.cj.jdbc.Driver");
			//4 DB연동
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
			//out.println("db연동 성공!" + conn);
			//5 PreparedStatement 이용해서 sql처리
			pstmt = conn.prepareStatement(sql); //##
			pstmt.setString(1, oname);	//1, oname		첫번째 물음표, 값
			pstmt.setInt(2, onum);	//2 onum		두번째 물음표, 값
			pstmt.setString(3, InetAddress.getLocalHost().getHostAddress());	// ip 세번째 물음표
			//6 결괏값 받아서 처리!
			//	pstmt.executeQuery();	sql-select쓸때만....
			int result = pstmt.executeUpdate();	//sql- insert, update or delete쓸때는 익스큐드업데이트...
			
			if(result>0){out.println( " <script>alert('주문성공!'); location.href='milk.jsp'; </script> " );}
			else{out.println( " <script>alert('관리자에게 문의바랍니다'); location.href='milk.jsp'; </script> " );}
			
		}catch(Exception e){e.printStackTrace();
		}finally{
			//if(rest!=null){rset.close();}
			if(pstmt!=null){pstmt.close();}
			if(conn!=null){conn.close();}
		
	};
	
	
	
//3 Driver 연동

//4 DB연동

//5 PreparedStatement 이용해서 sql처리

//6 결괏값 받아서 처리!



%>