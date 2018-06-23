<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ClassVO.ProfessorVO" %>
<%@ page import="ClassService.ProfessorService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	input[type="text"] {
		float:right;
	}
	input[type="submit"] {
		align:center;
	}
	form {
		width: 250px;
		text-align:left;
		margin-top:10px;
		
	}
	div form input[type="submit"] {
		width:100%;
	}
</style>
<body>
	<%@ include file="/index.jsp" %>
	<div align="center">
	<%	
		String id=session.getAttribute("signedUser2").toString();
		ProfessorVO professor=service2.professorSearch2(id);
		request.setAttribute("professor", professor);
		if(professor!=null){%>
			회원 정보 수정
			<form action="ProfessorUpdate.do" method="post">
				ID <input type="text" readonly name="id" readonly value="${professor.id}"><br><br>
				이름 <input type="text" name="name" readonly value="${professor.name}"><br><br>
				비밀번호 <input type="text" name="passwd" value="${professor.password}"><br><br>
				E-Mail <input type="text" name="email" value="${professor.email}"><br><br>
				Phone <input type="text" name="phone" value="${professor.phone}"><br><br>
				<input type="submit" value="수정하기"/>
			</form>
			
		<% }%>
	</div>

</body>
</html>