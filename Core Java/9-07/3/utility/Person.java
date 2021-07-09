package office.utility;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private Date bdate;
	
	public Person() {
		name="";
		bdate=new Date();
	}
	
	public Person(String name, int dd,int mm,int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Birthdate : ");
		bdate.showDate();
	}

	@Override
	public String toString() {
		return "Name : "+name+"\n"+"Birthdate : "+bdate;
	}
	
	//equals method in Person class
	
	
	
	
	
	
}
