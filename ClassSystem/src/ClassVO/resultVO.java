package ClassVO;

public class resultVO {
	private String id;
	private String number;
	private String grade;
	private String name;
	private String credit;
	private String professor;
	
	public resultVO() {}
	
	public resultVO(String number) {
		this.number = number;
	}
	
	public resultVO(String id, String number, String grade, String name, String credit, String professor) {
		super();
		this.id=id;
		this.number = number;
		this.grade = grade;
		this.name = name;
		this.credit = credit;
		this.professor = professor;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	
}
