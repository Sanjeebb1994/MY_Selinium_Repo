package pojo;

public class PojoObjectLibrary {
	public String name;
	public long phno;
	public String mail;
	public Object employee;
	public PojoObjectLibrary(String name, long phno, String mail, Object employee) {
		super();
		this.name = name;
		this.phno = phno;
		this.mail = mail;
		this.employee = employee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Object getEmployee() {
		return employee;
	}
	public void setEmployee(Object employee) {
		this.employee = employee;
	}
	
}
