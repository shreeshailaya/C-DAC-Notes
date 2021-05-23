class Date
{
int dd,mm,yy;
	public Date()
	{
		System.out.println(" constructor date without parameter");
	}

	public Date(int dd, int mm, int yy)
	{
		
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		System.out.println("Para Cinstructor called ");	
	}
	public void showDate()
	{
		System.out.println("Show Dater Function without parameter "+dd+"/" + mm + "/" + yy);
	}
	public void showDate(char ch)
	{
		System.out.println("Show Dater Function with parameter"+dd+""+ch+ + mm + ""+ch+ + yy);
	}
	
}
