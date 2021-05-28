package Ass1.App;

import Ass1.Utility.*;

public class EmpTypes 
{
	public static void main(String[] args) 
	{
		Emp [] emp = {new SalesManager("Sayali", 12, 9, 2000, 1003, 12000, 100000, 4.5),
						  new Programmer("Vishakha",11,7,1999,1004,15000,43.5,879),
						  new Admin("Trupti",15,12,1998,1008,11000,988)	
				       };
		
			double total = 0;
		
		for (int i=0;i<emp.length;i++)
		{
			 	emp [i].display();
			 	total = total+ emp[i].calSalary();
				System.out.println("Salary : "+emp[i].calSalary());
				System.out.println("*****************************");
				
		}
				System.out.println("Total Salary :"+total);
}}
