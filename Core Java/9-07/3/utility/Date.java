package office.utility;

import java.io.Serializable;

public class Date implements Serializable
{
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dd+"/"+mm+"/"+yy;
	}
	
	//equals method in Date
	
	
	
	
	
	
	
	
	
}
