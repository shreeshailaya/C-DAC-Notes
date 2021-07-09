package apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Emp [] allEmps= {new SalesManager("Amit",12,11,1998,1003,12000,100000,4.3,8),
		         new Programmer("Bakul",11,12,1997,1006,15000,34.5,98.7,10),
		         new Admin("Vaibhav",13,4,1990,1008,18000,987) };
		
		ObjectOutputStream object=new ObjectOutputStream(new FileOutputStream("D://Emp.xls"));
		
		
		
		for(Emp e: allEmps)
		{
			object.writeObject(e);
			System.out.println("data stored");
		}
		
		

	}

}





