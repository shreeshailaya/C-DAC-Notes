package collII_3;

import java.util.*;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Empolyee> emp = new TreeSet<>(new Comparator<Empolyee>() {

			@Override
			public int compare(Empolyee o1, Empolyee o2) {
				// TODO Auto-generated method stub
				//return (int)(o1.getSalary()-o2.getSalary());   
				return o1.getEmpid()-o2.getEmpid();
			}
		});
		
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
