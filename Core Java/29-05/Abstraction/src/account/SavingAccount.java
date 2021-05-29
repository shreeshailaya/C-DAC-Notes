package account;

public class SavingAccount extends Account {
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public SavingAccount(int accNo, String name, double balance, double wAmt) {
		super(accNo, name, balance);
		withdraw(wAmt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double wAmt) {
		// TODO Auto-generated method stub
		
		if(balance>2000) {
			System.out.println("You are allow to withdraw the balance");
			double remBal = balance - wAmt;
			
			if(remBal < 2000)
			{
				System.out.println("The withdraw amount is more thanyour limit ");
			}else {
				System.out.println("Withdraw Successfully ");
				System.out.println("Reamening Balance is "+remBal);
				System.out.println("********************************************************");
			}
			
		}
		
	}

	
}
