package Ass1.Utility;

public class Admin extends Emp
{
	private double bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int empid, double salary, double bonus) {
		super(name, dd, mm, yy, empid, salary);
		this.bonus = bonus;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Bonus : "+bonus);
	}
	
	@Override
	public double calSalary()
	{
		return bonus+salary;
	}
}
