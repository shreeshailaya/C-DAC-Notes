package customer;

import java.util.Scanner;

public class RegCustomer extends Customer {
	
	int regNo,dis,fdis;

	public RegCustomer() {
		
		// TODO Auto-generated constructor stub
		

	}
	public void accept()
	{
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Reg No");
		regNo= sc.nextInt();
		
		if(regNo!=0)
		{
			dis=price*5/100;
			fdis = price-dis;
			display();
		}
		
	}
	public void display()
	{
		System.out.println("****Congralution got 5% discount on your total bill****");
		System.out.println("Details of Customer as follow");
		System.out.println("Name:-     " +name+"     Email Address:-"+email);
		System.out.println("Address:-     "+address+"     Pin:-     "+pin);
		System.out.println("***************************************************************");
		System.out.println("Your total is:-  "+price);
		System.out.println("Your total with 5% discount is:-   "+fdis);
	}
	
	
}
