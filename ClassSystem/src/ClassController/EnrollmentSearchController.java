package ClassController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassService.classService;
import ClassVO.classVO;

public class EnrollmentSearchController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String major = request.getParameter("major");
		
		classVO cvo = new classVO();
		
		cvo = new classVO(major);
		classService service = classService.getInstance();
		ArrayList<classVO> list = service.enrollment(cvo);
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, response, "enrollmentList.jsp");
		
	}
}
