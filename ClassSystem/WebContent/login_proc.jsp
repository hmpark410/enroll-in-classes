<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ClassDAO.StudentDAO" %>
<%@ page import="ClassVO.StudentVO" %>
<%@ page import="ClassVO.ProfessorVO" %>
<%@ page import="ClassService.StudentService" %>
<%@ page import="ClassService.ProfessorService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		ProfessorVO pvo=new ProfessorVO();
		StudentVO vo =new StudentVO();
		
		vo.setId(id);
		vo.setPassword(password);
		
		pvo.setId(id);
		pvo.setPassword(password);
		
		StudentService service=StudentService.getInstance();
		StudentVO user= service.userSearch(vo);
		
		ProfessorService service2=ProfessorService.getInstance();
		ProfessorVO user2=service2.userSearch1(pvo);
		
		if(user!=null){
			session.setAttribute("signedUser",id);
			response.sendRedirect("index.jsp");
		}else if(user2!=null){
			session.setAttribute("signedUser2",id);
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>