<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="ClassVO.StudentVO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  ArrayList<StudentVO> list = (ArrayList<StudentVO>) request.getAttribute("list"); 
    if(!list.isEmpty()) {  %>
	   <table border="1">
	   		<tr><th>ID</th><th>비밀번호</th><th>이름</th></tr>
			
			<%   for(int i=0; i<list.size(); i++){   
			       StudentVO student = list.get(i);   %>
			       
			        <tr><td><%=student.getId() %></td>
			            <td><%=student.getPassword() %></td>
			            <td><%=student.getName() %></td>
			       </tr>
			<%   }
       }else{
    	   out.print("<h3>등록된 회원 정보가 없습니다.</h3>");
       }
	%>

</body>
</html>