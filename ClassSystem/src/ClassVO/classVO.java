package ClassVO;

public class classVO {
	private int number;
	private String grade;
	private String name;
	private int credit;
	private String professor;
	private String major;
	
	public classVO() {}
	
	public classVO (int number) {
		this.number = number;
	}
	
	public classVO(String major) {
		this.major = major;
	}

	public classVO(int number, String grade, String name, int credit, String professor, String major) {
		super();
		this.number = number;
		this.grade = grade;
		this.name = name;
		this.credit = credit;
		this.professor = professor;
		this.major = major;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
