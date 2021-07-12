package collII_2;

import java.util.*;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Empolyee> emp = new TreeSet<>();
		
		emp.add(new Empolyee(1, "Shree", 11.11));
		emp.add(new Empolyee(2, "Shree", 16.11));
		emp.add(new Empolyee(4, "Shree", 14.11));
		emp.add(new Empolyee(3, "Shree", 13.11));
		emp.add(new Empolyee(5, "Shree", 12.11));
		emp.add(new Empolyee(7, "Shree", 15.11));
		
		
		for(Empolyee e : emp)
		{
			System.out.println("EmpID :  "+e.getEmpid()+"  Name :   "+e.getName()+"  Salary  :  "+e.getSalary());
		}

		
		

	}

}
