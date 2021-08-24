package beans;

import java.util.List;

public class Emp 
{
	private int empid;
	private String ename;
	private Address add;
	List<String> emailids;
	private Dept dept;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Emp(int empid, String ename, Address add, List<String> emailids, Dept dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.add = add;
		this.emailids = emailids;
		this.dept = dept;
	}




	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public List<String> getEmailids() {
		return emailids;
	}
	public void setEmailids(List<String> emailids) {
		this.emailids = emailids;
	}
	
	
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", add=" + add + ", emailids=" + emailids + ", dept=" + dept
				+ "]";
	}

	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
	
	
}
