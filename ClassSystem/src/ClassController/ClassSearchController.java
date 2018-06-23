package ClassController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassService.classService;
import ClassVO.classVO;

public class ClassSearchController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		
		classVO cvo = new classVO();
		
		cvo = new classVO(number);
		classService service = classService.getInstance();
		ArrayList<classVO> list = service.classDeleteSearch(cvo);
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, response, "classDelete.jsp");
	}
}
