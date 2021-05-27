package books;

public class Book {
	String title;
	int bookId;
	float price;
	
	
	public Book() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, int bookId, float price) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.price = price;
	}
	public Book(int bookId, float price) {
		super();
		this.bookId = bookId;
		this.price = price;
	}
	public void displayBook()
	{
		System.out.println("Books Information:-");
		System.out.println("Title:-"+title+"Book ID:-"+bookId+"Price:-"+price);
		System.out.println("******************************************************");
	}
	

}
