package account;

public abstract class Account {
	int accNo;
	String name;
	protected double balance,wAmt;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public abstract void withdraw(double wAmt);
	//public abstract void accept();

}
