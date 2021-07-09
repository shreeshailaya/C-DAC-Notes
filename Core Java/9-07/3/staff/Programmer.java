package office.staff;

import office.utility.ITraveller;

public class Programmer extends Emp implements ITraveller
{
	private double extraHours,chargesPerHour;
	private int daysTravelled;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, double extraHours,
			double chargesPerHour, int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.extraHours = extraHours;
		this.chargesPerHour = chargesPerHour;
		this.daysTravelled = daysTravelled;
	}

	public String toString()
	{
		return super.toString()+"\nExtra Hours : "+extraHours+"\nCharges Per Hour : "+chargesPerHour;
	}

	@Override
	public double calSalary() {
		
		//return super.calSalary()+(extraHours*chargesPerHour);
		return salary+(extraHours*chargesPerHour)+calculateTA();
	}

	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return daysTravelled * (salary*(DA/100));
		  //days * DA in Rs
	}

	public int getDaysTravelled() {
		return daysTravelled;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
