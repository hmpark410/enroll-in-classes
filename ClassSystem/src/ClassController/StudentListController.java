package ClassController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassService.StudentService;
import ClassVO.StudentVO;

public class StudentListController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		StudentService service=StudentService.getInstance();
		ArrayList<StudentVO>list=service.studentList();
		request.setAttribute("list",list);
		HttpUtil.forward(request, response, "/StudentListOutput.jsp");
	}
}
