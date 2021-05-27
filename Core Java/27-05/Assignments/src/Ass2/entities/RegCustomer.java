package Ass2.entities;

public class RegCustomer extends Customer 
{
	int reg_no;
	
	//constructors
	
	public RegCustomer(String email, String name,double price, int reg_no) {
		super(email, name,price);
		this.reg_no = reg_no;
	}

	public RegCustomer() {
		super();
	}

	public double giveDiscount()
	{
		System.out.println("5% DISCUONT");
		return super.getPrice()-(super.getPrice()*5/100) ;
	}
	
	public String toString()
	{
		return  "\t Reg No  "+reg_no+super.toString();
		
	}
}
