<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "ClassVO.classVO" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<% ArrayList<classVO> list = (ArrayList<classVO>)request.getAttribute("list"); 
   		if(list.size() != 0) {  %>
   		<form action="enrollmentList.do" method="post">
	  		<table border="1">
	   			<tr><th>학수번호</th><th>학년</th><th>과목명</th><th>학점</th><th>교수명</th><th></th></tr>
				<% for(int i=0; i<list.size(); i++){   
			       classVO cs = list.get(i); %>
			        <tr><td><%=cs.getNumber()%></td>
			            <td><%=cs.getGrade() %></td>
			            <td><%=cs.getName() %></td>
			            <td><%=cs.getCredit() %></td>
			            <td><%=cs.getProfessor() %></td>
			            <td><input type="checkbox" name="class" value=<%=cs.getNumber() %>></td>
			       </tr>
			    <% } %>
	  		</table>
	  		<input type="submit" value="삭제">
		</form>
	<%}%>
	</div>
</body>
</html>