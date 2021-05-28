package Ass1.Utility;
public class Programmer extends Emp 
{
	private double extra_hours;
	private double charges_per_hour;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, double extra_hours,
			double charges_per_hour) {
		super(name, dd, mm, yy, empid, salary);
		this.extra_hours = extra_hours;
		this.charges_per_hour = charges_per_hour;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Extra hours : "+extra_hours);
		System.out.println("charges per hour : "+charges_per_hour);
	}


	@Override
	public double calSalary()
	{
		return (extra_hours*charges_per_hour)+salary;
	}
}
