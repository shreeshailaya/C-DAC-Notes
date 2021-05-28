package Ass1.Utility;
public class SalesManager extends Emp 
{
	private double target,incentive;

	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double target,
			double incentive) 
	{
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Target : "+target);
		System.out.println("Incentive : "+incentive);
	}
		


	public double calSalary()
	{
		return (target*incentive/100)+salary;
	}
	
	
}
