package ClassController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassService.ProfessorService;
import ClassVO.ProfessorVO;

public class ProfessorUpdateController implements Controller {
		public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");

			if (id.isEmpty() || passwd.isEmpty() || name.isEmpty()|| email.isEmpty()|| phone.isEmpty()) {
				request.setAttribute("error", "정보를 모두 입력해주세요");
				HttpUtil.forward(request, response, "/ProfessorUpdate.jsp");
				return;
			}

			ProfessorVO vo = new ProfessorVO();
			vo.setId(id);
			vo.setPassword(passwd);
			vo.setName(name);
			vo.setEmail(email);
			vo.setPhone(phone);

			ProfessorService service = ProfessorService.getInstance();
			service.professorUpdate(vo);
			ProfessorVO professor=service.professorSearch2(id);
			request.setAttribute("professor", professor);
			HttpUtil.forward(request, response, "/result/StudentUpdateOutput.jsp");
		}

}
