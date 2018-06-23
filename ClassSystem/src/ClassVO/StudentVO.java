package ClassVO;

public class StudentVO {
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	
	public StudentVO() {}


	public StudentVO(String id, String password, String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}


	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}

