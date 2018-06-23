package ClassController;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import ClassService.StudentService;
import ClassVO.StudentVO;


public class StudentUpdateController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");

		if (id.isEmpty() || passwd.isEmpty() || name.isEmpty()|| email.isEmpty()|| phone.isEmpty()) {
			request.setAttribute("error", "정보를 모두 입력해주세요");
			HttpUtil.forward(request, response, "/StudentUpdate.jsp");
			return;
		}

		StudentVO vo = new StudentVO();
		vo.setId(id);
		vo.setPassword(passwd);
		vo.setName(name);
		vo.setEmail(email);
		vo.setPhone(phone);


		StudentService service = StudentService.getInstance();
		service.studentUpdate(vo);
		StudentVO student=service.studentSearch(id);
		request.setAttribute("student", student);
		HttpUtil.forward(request, response, "/result/StudentUpdateOutput.jsp");
	}
}