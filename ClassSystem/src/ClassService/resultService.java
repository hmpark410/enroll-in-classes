package ClassService;

import java.util.ArrayList;

import ClassDAO.resultDAO;
import ClassVO.classVO;
import ClassVO.resultVO;

public class resultService {
	private static resultService service=new resultService();
	public resultDAO dao=resultDAO.getInstance();
	private resultService() {}
	
	public static resultService getInstance() {
		return service;
	}
	
	public void classInsert(resultVO vo) {
		dao.classInsert(vo);
	}
	
	public void resultDelete(resultVO vo) {
		dao.resultDelete(vo);
	}
	
	public ArrayList<resultVO> resultList(resultVO vo) {
		ArrayList<resultVO> list = dao.resultList(vo);
		return list;
	}
}
