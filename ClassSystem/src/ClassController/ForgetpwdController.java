package ClassController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ClassService.StudentService;
import ClassVO.StudentVO;

public class ForgetpwdController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String email = request.getParameter("email");	
		String name = request.getParameter("name");
		
		StudentVO vo =new StudentVO();
		vo.setId(id);
		vo.setName(name);
		vo.setEmail(email);
		
		StudentService service=StudentService.getInstance();
		StudentVO student= service.forgetPasswd(vo);
		
		request.setAttribute("student", student);
		HttpUtil.forward(request, response, "/forgetpwd_out.jsp");
	}
}
