package asstwo_3;

public class RegisterCustomer extends Customer {

	private int custid;
	private Customer cs;
	
	public RegisterCustomer(int custid,String name, String email, String contact) {
		super(name, email, contact);
	
		this.custid=custid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}
	
	
	public String toString()
	{
		//cs.getName();
		return "Reg Cust :"+custid;
	}

}
