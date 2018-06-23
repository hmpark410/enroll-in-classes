package ClassController;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import ClassService.StudentService;
import ClassVO.StudentVO;

public class StudentInsertController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id=request.getParameter("id");
	String password=request.getParameter("password");
	String name=request.getParameter("name");
	
	StudentVO student = new StudentVO(id,password,name);
	StudentService service=StudentService.getInstance();
	service.studentInsert(student);
	
	request.setAttribute("id",id);
	request.setAttribute("password",password);
	request.setAttribute("name",name);
	
	HttpUtil.forward(request,response,"/result/StudentInsertOutput.jsp");
	}
}
