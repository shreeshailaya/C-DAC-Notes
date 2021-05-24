public class Date
{
	int dd,mm,yy;
	public Date()
	{
		System.out.println("This is in the Date default Constructor");
	}
	
	public Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void display()
	{
		System.out.println(dd+"  "+mm+ "  "+yy);
	}
	
	public void display(char ch)
	{
		System.out.println(dd+ch+mm+ch+yy);
	}
}
