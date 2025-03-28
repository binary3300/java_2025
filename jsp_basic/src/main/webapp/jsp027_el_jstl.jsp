<%@page import="jsp023Servlet.Servlet001"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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
		<h3 class="card-header"> 001. el Expression Language(표현식) </h3>
		<p> <% out.println("hello!"); %> </p>
		<p> <%="hello~~" %> </p>
		<P> ${"Hello~~!!"} ${1 } ${789456123 } ${a } ${'a' }</P>
		<hr/>
		<p> <a href="jsp027_result.jsp?name=lulu">  PARAM</a> </p>
		<hr/>
		<% Servlet001 s = new Servlet001(1,2);
		   //pageContext.setAttribute("s", s); pageContext랑 request 둘 다 가능~!!
		   request.setAttribute("s", s);
		%>
		<p>객체.변수명 - getter(): ${s.a }</p>
	</div>
	<div class="container card my-5">
		<h3 class="card-header"> 002. jstl - if </h3>
		<c:if test="${1<20}"> 1은 20보다 작다 </c:if>
		
		<h3 class="card-header"> 002. jstl - for </h3>
		<%
		String [] movie ={"월e","퇴마록","에브리띵에브리웨어올앳원스","이웃집토토로"};
		pageContext.setAttribute("movie",movie);
		
		for(String m : movie){out.println(m);}
		%>
		<hr/>
		<c:forEach  var="m" items="${movie}" varStatus="status">
		${status.index} - ${m}
		</c:forEach>
		
		<%-- <c:forEach item="" var="">
		</c:forEach> --%>
		
		
		<!-- <p> -1.  반복문, 조건문 등의 기본구현
			-2.  사용법
			 1. http://jakarta.apache.org/
			 2. 왼쪽메뉴 :  Tablibs
			 3. Standard Taglib -  다운로드 - jakarta-taglibs-standard-1.1.1.zip
			 4. [WEB-INF]-[lib] - jstl.jar / standard.jar
			
			-3. jstl 라이브러리
			  core : 기본적인 기능제공
			  fmt  : format 형식
			  xml  : xml관련처리
			  sql  : sql관련처리
  	   </p> -->
	
	
	
	
	</div>
	</body>
</html>
