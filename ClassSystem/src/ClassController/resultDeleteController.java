package ClassController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClassService.resultService;
import ClassVO.resultVO;

public class resultDeleteController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		String[] chk = request.getParameterValues("class");
		
		for(String number : chk) {
			resultVO result = new resultVO(number);
			
			resultService service=resultService.getInstance();
			service.resultDelete(result);
			
			request.setAttribute("result", result);
		}
		
		HttpUtil.forward(request,response,"/result/enrollmentDelete.jsp");
	}
}
