package ClassController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ClassService.StudentService;
import ClassService.classService;
import ClassVO.StudentVO;
import ClassVO.classVO;

public class ClassInsertController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number=Integer.parseInt(request.getParameter("number"));
		String grade=request.getParameter("grade");
		String name=request.getParameter("name");
		int credit = Integer.parseInt(request.getParameter("credit"));
		String professor = request.getParameter("professor");
		String major = request.getParameter("major");
		
		classVO vo = new classVO();
		vo.setNumber(number);
		vo.setGrade(grade);
		vo.setName(name);
		vo.setCredit(credit);
		vo.setProfessor(professor);
		vo.setMajor(major);
		
		classService service=classService.getInstance();
		service.classInsert(vo);
		System.out.println(major);
		request.setAttribute("number",number);
		request.setAttribute("grade",grade);
		request.setAttribute("name",name);
		request.setAttribute("credit",credit);
		request.setAttribute("professor",professor);
		request.setAttribute("major",major);
		
		HttpUtil.forward(request,response,"/result/classInsertOutput.jsp");
	}

}
