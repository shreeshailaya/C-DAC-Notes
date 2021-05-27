package apps;

import java.util.Scanner;

import customer.Customer;
import customer.RegCustomer;

public class CustomerDemo {

	public CustomerDemo() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int regu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a register customer 1. Yes    2.NO");
		regu =sc.nextInt();
		if(regu==1)
		{
			RegCustomer rg = new RegCustomer();
			rg.accept();
			
		}else if (regu==2)
		{
			Customer c = new Customer();
			c.accept();
			c.display();
		}

	}

}
