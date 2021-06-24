package assignment1DynamicStack;

public class Empolyee {
	private int empid;
	private String empname;
	
	public Empolyee()
	{
		empid=0;
		empname="null";
	}
	
	
	public Empolyee(int empid,String name)
	{
		this.empid=empid;
		this.empname=name;
	}
	
	
	public String toString()
	{
		
		return " Emp ID:_"+empid+" Emp Name"+empname;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}
