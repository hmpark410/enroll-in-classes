package ClassService;

import java.util.ArrayList;

import ClassDAO.StudentDAO;
import ClassVO.StudentVO;


public class StudentService {
	private static StudentService service=new StudentService();
	public StudentDAO dao=StudentDAO.getInstance();
	private StudentService() {}
	
	public static StudentService getInstance() {
		return service;
	}
	
	public void studentInsert(StudentVO vo) {
		dao.StudentInsert(vo);
	}

	public StudentVO studentSearch(String id) {
		return dao.studentSearch(id);
	}
	
	public StudentVO userSearch(StudentVO vo) {
		return dao.userSearch(vo);
	}
	
	public void studentUpdate(StudentVO student) {
		dao.studentUpdate(student);
	}
	
	public StudentVO forgetPasswd(StudentVO vo) {
		return dao.forgetPasswd(vo);
	}
	
	public void studentDelete(StudentVO student) {
		dao.studentDelete(student);
	}
	
	public ArrayList<StudentVO> studentList(){
		ArrayList<StudentVO> list=dao.studentList();
		return list;
	}

}
