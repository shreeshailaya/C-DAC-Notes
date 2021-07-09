package office.staff;

import office.utility.ITraveller;

public class SalesManager extends Emp implements ITraveller
{
	private double target,incentive;
	private int daysTravelled;

	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double target, double incentive,
			int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		this.daysTravelled = daysTravelled;
	}

	public String toString()
	{
		return super.toString()+"\nTarget : "+target+"\nIncentive : "+incentive;
	}

	@Override
	public double calSalary() {
		//return super.calSalary()+(target*incentive/100);
		return salary+(target*incentive/100)+calculateTA();
	}

	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return daysTravelled * (salary*(DA/100));
	}

	public int getDaysTravelled() {
		return daysTravelled;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
