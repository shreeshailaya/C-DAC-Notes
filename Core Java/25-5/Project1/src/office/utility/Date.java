package office.utility;

public class Date {
	
	int dd,mm,yy;

	public Date() {
		// TODO Auto-generated constructor stub
		
		System.out.println("In the Date def Constructor");
		//System.out.println("Date in Date def con:-"+dd+""+mm+""+yy);
		
	}

	public Date(int dd, int mm, int yy) {
		//super();
		System.out.println("In tthe para date con");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void displayDate()
	{
		System.out.println("Date is  "+dd+"  "+mm+"  "+yy);
	}
	
}
