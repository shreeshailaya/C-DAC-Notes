package Ass1.Utility;

public class Date {
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
    public Date()
    {
    	
    }
    public void display()
    {
    	System.out.println("Date    : "+dd+"/"+mm+"/"+yy); 
    }
    public String toString()
    {
    	return dd+"/"+mm+"/"+yy;
    }
}
