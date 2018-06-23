package ClassService;

import ClassDAO.ProfessorDAO;
import ClassDAO.StudentDAO;
import ClassVO.ProfessorVO;
import ClassVO.StudentVO;

public class ProfessorService {
	private static ProfessorService service=new ProfessorService();
	public ProfessorDAO pdao=ProfessorDAO.getInstance();
	public StudentDAO dao=StudentDAO.getInstance();
	private ProfessorService() {}
	
	public static ProfessorService getInstance() {
		return service;
	}
	
	public void studentInsert(StudentVO student) {
		dao.StudentInsert(student);
	}
	
	public ProfessorVO userSearch1(ProfessorVO vo) {
		return pdao.userSearch2(vo);
	}
	
	public ProfessorVO professorSearch2(String id) {
		return pdao.professorSearch2(id);
	}
	
	public void professorUpdate(ProfessorVO professor) {
		pdao.professorUpdate(professor);
	}
	

}
