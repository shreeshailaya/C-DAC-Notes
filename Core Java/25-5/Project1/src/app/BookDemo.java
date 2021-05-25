package app;
import books.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.displayBook();
		
		Book b2 = new Book(2552,250.50f);
		b2.displayBook();
		
		Book b3 = new Book("Rich Dad Poor Dad",2253,150.36f);
		b3.displayBook();
	}

}
