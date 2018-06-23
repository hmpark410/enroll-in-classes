package ClassController;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ClassVO.StudentVO;
import ClassVO.classVO;
import ClassVO.resultVO;
import ClassService.StudentService;
import ClassService.resultService;

public class resultListController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		
		resultService service=resultService.getInstance();
		resultVO vo=new resultVO();
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("signedUser");
		vo.setId(id);
		ArrayList<resultVO>list=service.resultList(vo);
		request.setAttribute("list",list);
		HttpUtil.forward(request, response, "/result/enrollmentListResultOutput.jsp");
	}
}
