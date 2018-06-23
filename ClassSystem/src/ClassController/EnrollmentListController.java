package ClassController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ClassService.resultService;
import ClassVO.resultVO;


public class EnrollmentListController implements Controller {
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("signedUser");
		String number=request.getParameter("number");
		String grade=request.getParameter("grade");
		String name=request.getParameter("name");
		String credit=request.getParameter("credit");
		String professor=request.getParameter("professor");
		
		resultVO vo=new resultVO();
		vo.setId(id);
		vo.setNumber(number);
		vo.setGrade(grade);
		vo.setName(name);
		vo.setCredit(credit);
		vo.setProfessor(professor);
		
		
		resultService service=resultService.getInstance();
		service.classInsert(vo);
		
		request.setAttribute("vo", vo);	
		
		HttpUtil.forward(request,response,"/result/enrollmentSuccess.jsp");
	}

	
	
	
}
