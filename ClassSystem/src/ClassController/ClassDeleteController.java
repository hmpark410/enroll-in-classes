package ClassController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassService.classService;
import ClassVO.classVO;

public class ClassDeleteController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
	
		classVO vo = new classVO(number);
			
		classService service=classService.getInstance();
		service.classDelete(vo);
			
		request.setAttribute("vo", vo);
		System.out.println(number);
		
		HttpUtil.forward(request,response,"/result/enrollmentDelete.jsp");
	}
}
