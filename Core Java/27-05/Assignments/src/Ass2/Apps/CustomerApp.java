package Ass2.Apps;

import java.util.Scanner;

import Ass2.Apps.*;
import Ass2.entities.*;
public class CustomerApp {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter type of customer(c/r)?");
		char custtype = sc.next().charAt(0);
		System.out.println("Enter email : ");
		String email = sc.next();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		
		double res;
		Customer c=null;;
		if(custtype == 'c')
		{
			c = new Customer(email,name,price);
			System.out.println(c);
		    System.out.println(" Net Price "+c.giveDiscount());
		}
		else if(custtype == 'r')
		{
			System.out.println("Enter reg_no : ");
			int no = sc.nextInt();
			c = new  RegCustomer(email,name,price,no);
			System.out.println(c);
		    System.out.println(" Net Price "+c.giveDiscount());

		}
		
			}

}

