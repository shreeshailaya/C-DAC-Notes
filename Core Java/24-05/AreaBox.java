class AreaBox
{
	int l,b,h;
	public AreaBox(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	public void displayArea()
	{
		System.out.println(" The area is:- "+l*b*h);
	}
}
