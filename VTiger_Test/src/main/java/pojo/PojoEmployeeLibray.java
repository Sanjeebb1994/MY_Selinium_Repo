package pojo;

public class PojoEmployeeLibray {
	
	public String name;
	public int[] phno;
	public String eid;
	public PojoEmployeeLibray(String name, int[] phno, String eid) {
		super();
		this.name = name;
		this.phno = phno;
		this.eid = eid;
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
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	
}
