package office.staff;

public class Admin extends Emp 
{
	private double allowance;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int empid, double salary, double allowance) {
		super(name, dd, mm, yy, empid, salary);
		this.allowance = allowance;
	}
	
	public String toString()
	{
		return super.toString()+"\nAllowance : "+allowance;
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		//return super.calSalary()+allowance;
		return salary+allowance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
