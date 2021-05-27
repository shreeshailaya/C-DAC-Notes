package office.utiliity;

public class Date {
	int dd,mm,yy;

	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}
