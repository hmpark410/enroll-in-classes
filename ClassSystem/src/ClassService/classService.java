package ClassService;

import java.util.ArrayList;
import ClassDAO.classDAO;
import ClassVO.classVO;

public class classService {
	private static classService service = new classService();
	public classDAO dao = classDAO.getInstance();
	
	private classService() {}
	
	public static classService getInstance() {
		return service;
	}
	
	public void classInsert(classVO vo) {
		dao.classInsert(vo);
	}
	
	public void classDelete(classVO vo) {
		dao.classDelete(vo);
	}
	
	public classVO memberSearch(classVO vo) {
		return dao.enrollmentSearch(vo);
	}
	
	public ArrayList<classVO> classDeleteSearch(classVO vo) {
		ArrayList<classVO> list = dao.classDeleteSearch(vo);
		return list;
	}
	
	public ArrayList<classVO> enrollment(classVO vo) {
		ArrayList<classVO> list = dao.enrollment(vo);
		return list;
	}
}
