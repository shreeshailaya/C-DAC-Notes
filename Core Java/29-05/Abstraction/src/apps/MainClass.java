package apps;

import java.util.Scanner;

import account.Account;
import account.RecurringAccount;
import account.SavingAccount;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new SavingAccount(255,"shree",2005,4);
		//a.withdraw(4);
		
		Account b =new RecurringAccount(255,"shree Rec",2005,500);
		//b.withdraw(5);
		
		
		Account [] acc = new Account[3];
		acc[0]=new SavingAccount(200,"A",2010,6);
		acc[1]=new SavingAccount(201,"B",2005,10);
		acc[2]=new RecurringAccount(202,"C",2000,2565);
		
		
		System.out.println("____________________________________________________________");
		System.out.println("From For each/ Advance loop");
		Scanner sc = new Scanner(System.in);
		Account [] acc1 = new Account[3];
		for(Account ax:acc1)
		{
			System.out.println("Enter Account type 1.Saving 2. Recurring");
			int cho = sc.nextInt();
			if(cho==1)
			{
				System.out.println("Enter Account no");
				int accNo = sc.nextInt();
				System.out.println("Enter Name ");
				String name = sc.next();
				System.out.println();
				System.out.println("Enteer Total balance");
				double balance = sc.nextDouble();
				System.out.println("Enter withdraw amount ");
				double wAmt = sc.nextDouble();
				Account a1 = new SavingAccount(accNo,name,balance,wAmt);
				
			}else if (cho ==2) {
				/*
				System.out.println("Enter Account no");
				int accNo = sc.nextInt();
				System.out.println("Enter Name ");
				String name = sc.next();
				System.out.println();
				System.out.println("Enteer Total balance");
				double balance = sc.nextDouble();
				System.out.println("Enter withdraw amount ");
				double wAmt = sc.nextDouble();
				*/
				System.out.println("Enter withdraw amount ");
				double amt = sc.nextDouble();
				Account a1 = new RecurringAccount(amt);
			}else {
				System.out.println("Invalid i/p");
			}
			
		}
		
	}

}
