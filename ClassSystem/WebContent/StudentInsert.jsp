<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	input[type="password"] {
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
		회원추가<br>
		<form action="StudentInsert.do" method="post">
			ID <input type="text" name="id"><br><br>
			비밀번호 <input type="password" name="password"><br><br>
			이름 <input type="text" name="name"><br><br>
		<input type="submit" value="추가">
		</form>
	</div>
</body>
</html>