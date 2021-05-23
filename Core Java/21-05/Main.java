public class Main
{
	public static void main(String args[])
	{
		System.out.println("Hello Main");
		Date d1;
		d1=new Date(2,4,6);
		Date d2 = new Date();
		d1.showDate();
		d2.showDate();
		d1.showDate('*');
		
	}
}