package pojo;

public class PojoLibreary {
	
	public String name;
	public int phNo;
	public String emailId;
	public PojoLibreary() {
		
	}
	public PojoLibreary(String name, int phNo, String emailId) {
		super();
		this.name = name;
		this.phNo = phNo;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
