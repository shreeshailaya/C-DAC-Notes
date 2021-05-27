package banking;

public class Account {
	
	String name;
	int no;
	float bal;

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Account(int no, float bal) {
		super();
		this.no = no;
		this.bal = bal;
	}



	public Account(String name, int no, float bal) {
		//super();
		this.name = name;
		this.no = no;
		this.bal = bal;
	}
	
	public void displayAccount()
	{
		System.out.println("Account information is:-");
		System.out.println("Name:-"+name+"Account Number:-"+no+"Balance is:- "+bal);
		System.out.println("***********************************************************");
	}

}
