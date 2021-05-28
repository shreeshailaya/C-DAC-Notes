package Ass1.Utility;
public class Date {
	private int dd,mm,yy;

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
}
