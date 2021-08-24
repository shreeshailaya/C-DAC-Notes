package beans;

public class Dept {
	int dno;
	String dname;
	String location;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int dno, String dname, String location) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
	}
	
	/*public Dept(String dname, String location, int dno) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.location = location;
	}*/
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", location=" + location + "]";
	}
	
	
}
