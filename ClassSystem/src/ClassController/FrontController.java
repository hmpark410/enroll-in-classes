package ClassController;

import java.io.*;

import java.util.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FrontController extends HttpServlet {
	String charset = null;
	HashMap<String, Controller> list=null;
	
	public void init(ServletConfig sc) throws ServletException{
		charset = sc.getInitParameter("charset");
		list=new HashMap<String,Controller>();
		list.put("/StudentUpdate.do", new StudentUpdateController());
		list.put("/StudentInsert.do", new StudentInsertController());
		list.put("/enrollmentList.do", new EnrollmentListController());
		list.put("/enrollmentSearch2.do", new EnrollmentSearchController2());
		list.put("/StudentList.do", new StudentListController());
		list.put("/forgetpwd.do", new ForgetpwdController());
		list.put("/ProfessorUpdate.do", new ProfessorUpdateController());
		list.put("/resultList.do", new resultListController());
		list.put("/resultDelete.do", new resultDeleteController());
		list.put("/classInsert.do", new ClassInsertController());
		list.put("/classSearch.do", new ClassSearchController());
		list.put("/classDelete.do", new ClassDeleteController());
		list.put("/enrollmentSearch.do", new EnrollmentSearchController());
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		request.setCharacterEncoding(charset);
		String url=request.getRequestURI();
		String contextPath=request.getContextPath();
		String path=url.substring(contextPath.length());
		Controller subController=list.get(path);
		subController.execute(request,response);
	}
}
