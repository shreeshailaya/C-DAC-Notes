package account;

public class RecurringAccount extends Account {
	double installment;
	
	public RecurringAccount(int accNo, String name, double balance, double installment) {
		super(accNo, name, balance);
		this.installment = installment;
		withdraw(installment);
	}

	@Override
	public void withdraw(double wAmt) {
		// TODO Auto-generated method stub
		
		System.out.println("You Cannot withdraw from this account");
		System.out.println("*****************************************************");
	}

	public RecurringAccount(double wAmt) {
		super();
		withdraw(wAmt);
		// TODO Auto-generated constructor stub
	}



}
