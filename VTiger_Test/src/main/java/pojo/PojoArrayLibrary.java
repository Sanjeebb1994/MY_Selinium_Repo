package pojo;

public class PojoArrayLibrary {
	
	public String name;
	public int [] phno;
	public String email;
	public PojoArrayLibrary(String name, int[] phno, String email) {
		super();
		this.name = name;
		this.phno = phno;
		this.email = email;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getPhno() {
		return phno;
	}
	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
