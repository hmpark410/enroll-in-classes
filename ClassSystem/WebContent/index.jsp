<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ClassDAO.StudentDAO" %>
<%@ page import="ClassVO.StudentVO" %>
<%@ page import="ClassService.StudentService" %>
<%@ page import="ClassVO.ProfessorVO" %>
<%@ page import="ClassService.ProfessorService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강신청</title>
</head>
<style>
	a {
		text-decoration:none;
		color:black;
	}
	.l0 {
		margin-right:60px;
	}
	.l01 {
		margin-right:60px;
	}
	.l02 {
		margin-right:60px;
	}
	.l1 {
		margin-right:60px;
	}
	.l2{
		margin-right:30px;
	}
	.l3 {
	 	margin-left:30px;
	}
	.l4 {
		margin-left:60px;
	}
	div {
		margin-bottom:20px;
	}
</style>
<body>
<%
	
	
	StudentVO vo =new StudentVO();
	StudentService service=StudentService.getInstance();
	StudentVO user= service.userSearch(vo);
	
	ProfessorVO pvo = new ProfessorVO();
	ProfessorService service2=ProfessorService.getInstance();
	ProfessorVO user2=service2.userSearch1(pvo);

%>
<div align="center">
	<h1>수강신청</h1>
	<%if(session.getAttribute("signedUser")!=null){%>
	<p><%=session.getAttribute("signedUser") %>님 환영합니다.<br>
	<%} %>
	<%if(session.getAttribute("signedUser2")!=null){%>
	<p><%=session.getAttribute("signedUser2") %>님 환영합니다.<br>
	<%} %>
	<hr>
	<%if(session.getAttribute("signedUser")==user){ %>
	<a href="classInsert.jsp" class="l0" >강의추가</a>&nbsp;&nbsp;
	<a href="classSearch.jsp" class="l01" >강의삭제</a>&nbsp;&nbsp;
	<a href="enrollmentSearch.jsp" class="l02" >강의목록</a>&nbsp;&nbsp;
	<a href="StudentInsert.jsp" class="l1" >회원추가</a>&nbsp;&nbsp;
	<a href="StudentList.do" class="l2" >회원현황</a>&nbsp;&nbsp;
	<a href="ProfessorUpdate.jsp" class="l3" >개인정보수정</a>&nbsp;&nbsp;
	<%} %>
	<%if(session.getAttribute("signedUser2")==user2){ %>
	<a href="enrollmentSearch2.jsp" class="l1" >수강신청</a>&nbsp;&nbsp;
	<a href="resultList.do" class="l2" >수강신청현황</a>&nbsp;&nbsp;
	<a href="StudentUpdate.jsp" class="l3">개인정보수정</a>&nbsp;&nbsp;
	<%} %>
	
	<a href="logout_proc.jsp" class="l4" >로그아웃</a>&nbsp;&nbsp;
	<hr>

</div>
</body>
</html>