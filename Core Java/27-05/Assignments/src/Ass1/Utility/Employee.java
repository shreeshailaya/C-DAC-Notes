package Ass1.Utility;

public class Employee extends Person {
	private int empid;
	private int salary;

	
	public Employee(int empid,String name, int dd, int mm, int yy,  int salary) {
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}
	public Employee( ) {
		super();
	}
	
    public void display()
    {
    	System.out.println(" Emp Id :"+empid);
    	super.display();
    	System.out.println("Salary : "+salary);
    }
    public String toString()
    {
    	return "\t"+empid+super.toString()+"\t"+salary;
    }
}
