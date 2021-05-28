package Ass2.Utility;
public abstract class Book
{
	private String Title;
    protected float price ;
    static int bookid;
    static
    {
    	bookid=1000;
    }
	

	public Book(String name,float price)
	{	
		Title=name;
		this.price=price;
		bookid++;

	}

	public void display()
	{
		System.out.println("Title of the Book :"+Title);
		System.out.println("BookId : "+bookid);
		System.out.println("Cost of the Book  : "+price);
		
	}
	public abstract double calCost();
	
}	