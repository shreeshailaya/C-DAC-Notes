package office.empolyee;

import office.staff.Person;

public class Empolyee extends Person {
	
	float salary;
	int empId;

	public Empolyee() {
		// TODO Auto-generated constructor stub
	}

	public Empolyee(String name, int dd, int mm, int yy, float salary, int empId) {
		super(name, dd, mm, yy);
		// TODO Auto-generated constructor stub
		
		this.salary=salary;
		this.empId=empId;
	}
	
	public void display()
	{
		System.out.println("from Super Class Person Date and Name of Person");
		super.display();
		System.out.println("from Empolyee class salary and empolyee ID");
		System.out.println("Salary:-  "+salary+"empID:-  "+empId);
	}
	

}
