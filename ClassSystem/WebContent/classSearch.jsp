<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	form {
		margin-top : 10px;
	}
</style>
<body>
	<%@ include file="/index.jsp" %>
	<div align="center">
		강의삭제<br>
		<form action="classSearch.do" method="post">
			학수번호
			<input type="text" name="number">
			<input type="submit" value="확인">
		</form>
	</div>
</body>
</html>