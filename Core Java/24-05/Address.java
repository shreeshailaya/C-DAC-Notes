class Address
{
	String area,city,pin;
	
	public Address(String area, String city, String pin)
	{
		this.area=area;
		this.city=city;
		this.pin=pin;
	}
	
	public void displayAddress()
	{
		System.out.println("Area:- "+area);
		System.out.println("City:- "+city);
		System.out.println("Pin:- "+pin);
	}
}
