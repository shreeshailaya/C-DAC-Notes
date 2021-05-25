package office.staff;
import office.utility.*;
public class Person {
	
	String name;
	Date d1;

	public Person(String name, int dd, int mm, int yy) {
		// TODO Auto-generated constructor stub
		this.name = name;
		d1 = new Date(dd,mm,yy);
	}
	public void displayPerson()
	{
		System.out.println("Name is:-"+name);
		System.out.println("Date:--");
		if(d1!=null)
		{
			d1.displayDate();
		}
		
	}
}
