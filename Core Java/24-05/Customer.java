class Customer
{
	String email;
	Address adrs;
	
	public Customer(String email, String area, String city, String pin)
	{
		this.email=email;
		adrs = new Address(area, city, pin);
	}
	
	public void displayCustomer()
	{
		System.out.println("Email:- "+email);
		if(adrs!=null)
		{
			System.out.println("Address is:-");
			adrs.displayAddress();
		}
	}
}
