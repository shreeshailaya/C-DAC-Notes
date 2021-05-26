package customer;

import java.util.Scanner;

public class Customer {
	String name, email,address,pin;
	int price;
	public Customer()
	{

		//display();
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter email ID");
		email=sc.next();
		System.out.println("Enter Address");
		address=sc.next();
		System.out.println("Enter Pin");
		pin=sc.next();
		System.out.println("Enter Total Price");
		price=sc.nextInt();
	}
	public void display()
	{
		System.out.println("********* Sorry you dont got discount *********");
		System.out.println("Details of Customer as follow");
		System.out.println("Name:-     " +name+"    Email Address     "+email);
		System.out.println("Address:-     "+address+"     Pin:-     "+pin);
		System.out.println("***************************************************************");
		System.out.println("Your total is:-  "+price);
	}
	

}
