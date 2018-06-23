<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ClassVO.StudentVO" %>
<%
     request.setCharacterEncoding("UTF-8");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%StudentVO student = (StudentVO)request.getAttribute("student");
		if(student != null) {%>
			<script type="text/javascript">
				alert("${student.id}님의 비밀번호는 ${student.password}입니다.");
				document.location.href="login.jsp";
			</script>
		<% } else {%>
			<script type="text/javascript">
				alert("검색결과가 없습니다.");
				document.location.href="login.jsp";
			</script>
		<%} %>
</body>
</html>