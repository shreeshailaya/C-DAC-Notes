package office.staff;

import office.utility.Person;

public abstract class Emp extends Person 
{
	private int empid;
	protected double salary;
	
	public Emp() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, int dd, int mm, int yy, int empid, double salary) {
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+"Empid : "+empid+"\nSalary : "+salary; 
	}
	
	//equals method in Emp class
	
	/*public double calSalary()
	{
		return salary;
	}*/
	
	public abstract double calSalary();

	public int getEmpid() {
		return empid;
	}
	
	
	
}






