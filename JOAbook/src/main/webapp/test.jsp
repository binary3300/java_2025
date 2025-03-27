<%@page import="com.company.domain.BoardVo"%>
<%@page import="com.company.dao.BoardDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- header -->
<!-- header -->
<!-- header -->
<!-- header -->
<body>
	<div class="container card my-5">
		<h3 class="card-header text-center p-3">JOAbook test</h3>
		<div class="card p-3 m-3">
		<h4>#2-1</h4>
			<p>(전에 만든거 보면서 하고 긁어오고 그러는게 오타안나고 정확하다)</p>
			<dl>
			<dt>>1) dynamic web project - JOAbooks</dt>
				<dd>java파일이나 jsp파일만들듯이 다이나믹 웹프로젝트를 새로 만든다. 단, 가장 바깥 폴더에서!
				그리고 체크박스를 잘 확인해서 web.xml만들기도 체크한다</dd>
				
			<dt>>2) inc - header/footer</dt>
				<dd>그렇게 만들어진 프로젝트 폴더 안에서 webapp폴더에 test 혹은 본문 페이지를 만들기 시작한다.
				헤더랑 푸터를 따로 만들어서 inc라는 폴더에 정리한다.</dd>
				
			<dt>>3) error page 설정 - 400/500</dt>
				<dd>에러페이지도 400이랑 505를 만든다. 만든 페이지는 inc에 넣고, 이 페이지는 에러페이지가 맞아! 라고 가장 위에서 선언해준다.
				그리고 web.xml에 가서 에러가 나면 내가 만든 에러페이지로 가라고 설정해준다. 이게 컨트롤러를 설정해주는거임!</dd>
				
			<dt>>4) dbcp 연동</dt>
				<dd>서버폴더에 있는 server로 들어가서 맨 밑에 context를 context /context로 만들고 사이에다가 위에 있는 db연동선언을 넣어준다</dd> 
			</dl>
		</div>
	
<%-- 		<%	
		<div class="card p-3 m-3">
		<h4>DBCP</h4>
			Context initContext = new InitialContext(); //Context찾겠다 - Resource
	        Context envContext  = (Context)initContext.lookup("java:/comp/env"); //환경 Context
	        DataSource ds         = (DataSource)envContext.lookup("jdbc/mbasic");//pool 이름
	        Connection conn = ds.getConnection(); //db연동 
			out.println("db연동");
		</div>
	</div>
		%> --%>
<!-- end div -->
<!-- end div -->
<!-- end div -->
	<div class="container card my-5">
		<h3 class="card-header text-center p-3">PROJECT (2) MODEL</h3>
		<div class="card p-3 m-3">
			<ol>
				<li>DB: table명- board mysql에서 테이블 만들기</li>
				<li>Dto: [com.company.domain] - BorderVo	private</li>
				<li>DBManager: [com.company.dbmanager] - DBManager</li>
				<li>Dao: [com.company.dao] - BorderDao</li>
				<li>Test </li>		
			</ol>
		</div>
		<%
/* 		BoardDao dao = new BoardDao(); */
		//6 deletr
/* 		System.out.println( dao.delete(4) );
		System.out.println( dao.select(4) ); */
		// 5 update
/* 			BoardVo vo = new BoardVo();
			vo.setBtitle("새 제목");
			vo.setBcontent("새 내용");
			vo.setBno(4);
			System.out.println( dao.update(vo) );
			System.out.println( dao.select(4) ); */
		// 4.
		//System.out.println(dao.updateHit(1));
		// 3. select
		//System.out.println(dao.select(1));
		// 1. selectAll
		//System.out.println( dao.selectAll() );
		// 2. insert( BoardVo vo ) - btitle, bcontent, bname
		/*
		BoardVo vo = new BoardVo();
		vo.setBtitle("첫번째 문의드려요!");
		vo.setBcontent("내용");
		vo.setBname("first");
		System.out.println( dao.insert(vo) ); //1
		*/
		// 1. selectAll
		/* System.out.println(dao.selectAll()); */
		
		%>
	</div><!-- end div -->
	
		<h3 class="card-header text-center p-3">PROJECT (3) VIEW</h3>
		<div class="card p-3 m-3">
		<h4>힘내자</h4>
			<p>(전에 만든거 보면서 하고 긁어오고 그러는게 오타안나고 정확하다)</p>
			<dl>
			<dt>[webapp] - [board]</dt>
				<dd>list.jsp</dd>
				<dd>write.jsp</dd>
				<dd>detail.jsp</dd>
				<dd>update.jsp</dd>
 
			</dl>
		</div>
	</div>
	
<!-- footer -->
<!-- footer -->
<!-- footer -->
<!-- footer -->
<%@include file="inc/footer.jsp" %>
