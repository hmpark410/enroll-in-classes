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
<style>
	.sub1 {
	        background: none;
	        border: 0px;
	        outline: none;
	        color: blue;
	        text-decoration: none;
	        font-size: 15px;
	    }
</style>
<body>
	<%@ include file="/classSearch.jsp" %>
	<div align="center">
		<% ArrayList<classVO> list = (ArrayList<classVO>)request.getAttribute("list"); 
   		if(list.size() != 0) {  %>
   		<form action="classDelete.do" method="post">
	  		<table border="1">
	   			<tr><th>학수번호</th><th>학년</th><th>과목명</th><th>학점</th><th>교수명</th><th></th></tr>
				<% for(int i=0; i<list.size(); i++){   
			       classVO cs = list.get(i); %>
			        <tr><td><input type="text" name="number" readonly value="<%=cs.getNumber()%>" size="10" style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; text-align:center;"></td>
			            <td><input type="text" name="grade" readonly value="<%=cs.getGrade()%>" size="10" style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; text-align:center;"></td>
			            <td><input type="text" name="name" readonly value="<%=cs.getName()%>" size="20" style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; text-align:center;"></td>
			            <td><input type="text" name="credit" readonly value="<%=cs.getCredit()%>" size="10" style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; text-align:center;"></td>
			            <td><input type="text" name="professor" readonly value="<%=cs.getProfessor()%>" size="10" style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; text-align:center;"></td>
			            <td><input type="submit" class="sub1" name="class" value="삭제"></td>
			       </tr>
			    <% } %>
	  		</table>
		</form>
	<%}%>
	</div>
</body>
</html>