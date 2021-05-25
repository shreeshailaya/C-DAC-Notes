package app;
import banking.*;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.displayAccount();
		
		Account a2 = new Account(256145, 25698.22f);
		a2.displayAccount();
		
		Account a3 = new Account("Shree",24545,25646.2f);
		a3.displayAccount();
	}

}
