public class Account
{
	int no,bal;
	static float rate;
	static
	{
		 rate=2.4f;
	}
	public Account(int no, int bal)		
	{
		this.no=no;
		this.bal=bal;	
	}
	public void displayInfo()
	{
		System.out.println("Account no is :-"+no);
		System.out.println("Account balance is :-"+bal);
		System.out.println("Account rate is :-"+rate);
	}
 	public static void changeRate(float rate)
	{
		rate=rate;
		System.out.println("Changed Rate is "+rate);	
		
	}
}