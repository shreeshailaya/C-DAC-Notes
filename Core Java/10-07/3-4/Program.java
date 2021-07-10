package asstwo_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/shree/Desktop/shree"));
		//ObjectOutputStream oosnr = new ObjectOutputStream(new FileOutputStream("/home/shree/Desktop/shree"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/shree/Desktop/shree"));
		List<Customer> cust = new ArrayList<>();
		List<RegisterCustomer> regcust = new ArrayList<>();
		int choise;

		do 
		{
			
		
		System.out.println("1.Enter Information of Customer");
		System.out.println("2.Sort Customer according to Reg nonReg");
		System.out.println("3.Display Registred Customer");
		System.out.println("4.Display NonRegistred Customer ");
		
		System.out.println("0 FOR EXIT");
		
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		switch(choise)
		{
		case 1:
			System.out.println("1.Registred");
			System.out.println("2.NotRegistred");
			int custtype=sc.nextInt();
			switch(custtype)
			{
			case 1:
				System.out.println("Enter Customer ID");
				int custid = sc.nextInt();
				System.out.println("Enter Customer Name ");
				String name = sc.next();
				System.out.println("Enter Customer Email ");
				String email = sc.next();
				System.out.println("Enter Customer ContactNo ");
				String contact=sc.next();
				RegisterCustomer rc = new RegisterCustomer(custid, name, email, contact);
				oos.writeObject(rc);
				System.out.println("Customer Searialized as REGISTRED");
				break;
			case 2:
				System.out.println("Enter Customer Name ");
				String nrname = sc.next();
				System.out.println("Enter Customer Email ");
				String nremail = sc.next();
				System.out.println("Enter Customer ContactNo ");
				String nrcontact=sc.next();
				Customer c = new Customer(nrname, nremail, nrcontact);
				oos.writeObject(c);
				System.out.println("Customer Searialized as NOTREGISTRRED");
				break;
			}
			break;
			
		case 2:
			
			//Customer [] cusarr = new Customer[10];
			//RegisterCustomer [] regcusarr = new RegisterCustomer[10];

			//RegisterCustomer rc;
			while(true)
			{
				try {
				//Customer c;
				
				Object o = ois.readObject();
				if(o instanceof RegisterCustomer)
					
					//c=(Customer)ois.readObject();
					regcust.add((RegisterCustomer)o); 
					
					
				else //if( o instanceof Customer)
				
					
					//rc=(RegisterCustomer)ois.readObject();;
					cust.add((Customer)o);
					
					
					
				
				}catch(Exception e)
				{
					break;
				}
				}
			break;
			
			
		case 3:
			System.out.println(regcust);	
			break;
		case 4:
			System.out.println(cust);
			break;
			
		
		}
		
		}while(choise!=0);
			
			
		}
		
		
	}


