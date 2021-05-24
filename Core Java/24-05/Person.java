class Person
{
	private String name;
    	private Date bdate;
    	
	public Person()
	{
		System.out.println("This is Person default Constructor");
		this.name = new String("New String default Constructor");
		this.bdate = new Date(); 
	}
	
	public Person(String name, int dd, int mm, int yy)
	{
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	public void displayPerson()
	{
		System.out.println("Name :-"+name );
		
		if (this.bdate!=null)
		{
			System.out.println("BirdthDay:--");
			bdate.display();
		}	
	}
}	
