package Ass1.Utility;

public class Person {
	private String name;
	private Date bdate;
	public Person(String name, int dd,int mm,int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	public Person() {
		super();
	}
	public void display()
	{
		System.out.println(" Name   : "+name);
		bdate.display();
	}
	public String toString()
	{
		return "\t"+name+"\t"+bdate.toString();
	}

}
