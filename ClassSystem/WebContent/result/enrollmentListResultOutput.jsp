<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="ClassVO.resultVO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	input[type="submit"] {
		margin-top:10px;
	}
</style>
<body>
	<%@ include file="/index.jsp" %>
	<div align="center">
	<%  ArrayList<resultVO> list = (ArrayList<resultVO>) request.getAttribute("list"); 
	   	if(!list.isEmpty()) {  %>
		   	<form action="resultDelete.do" method="post">
				  <table border="1">
				   	<tr><th>학수번호</th><th>학년</th><th>과목명</th><th>학점</th><th>교수명</th><th></th></tr>
					<%   for(int i=0; i<list.size(); i++){   
						      resultVO result = list.get(i);   %>
						       <tr><td><%=result.getNumber() %></td>
						           <td><%=result.getGrade() %></td>
						           <td><%=result.getName() %></td>
						           <td><%=result.getCredit() %></td>
					            <td><%=result.getProfessor() %></td>
					            <td><input type="checkbox" name="class" value=<%=result.getNumber() %>></td>
					       </tr>
					<%   } %>
				</table>
				<input type="submit" value="삭제">
			</form>
		<% }else{ %>
			<script>
				alert('등록된 정보가 없습니다.');
				location.href="index.jsp";
			</script>
		<% }%>
	</div>
</body>
</html>