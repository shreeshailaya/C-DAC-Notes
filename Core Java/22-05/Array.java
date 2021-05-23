class Array
{	
	int x[]= new int[5];
	public void addArr()
	{
		for(int i=0;i<5;i++)
		{
			x[i]=i*5;
		}
			
	}
	public void displayArr()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("--"+x[i]);
		}
	}
}