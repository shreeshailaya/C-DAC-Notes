package Ass2.App;

import java.util.Scanner;

import Ass2.Utility.*;

public class BookDemo
 {

	public static void main(String[] args)
	{
		/*
		 * Book [] allbook = new Book[5];
		 * 
		 * allbook[0] = new EBook("R.D Sharma,Mathematics",1008,560); allbook[1] = new
		 * PaperBook ("S.Chand,Science",1767,800); allbook[2] = new EBook
		 * ("Arihant,Science",1467,1200); allbook[3] = new PaperBook
		 * ("S.Chand,Social Science",1367,1000); allbook[4] = new EBook
		 * ("S.Chand,Chemestry",1567,800); for (int i=0;i<allbook.length;i++) { allbook
		 * [i].display(); System.out.print( allbook[i].calCost()); System.out.println();
		 * }
		 */
		Book [] books = new Book[5];
		
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter 5 Book Information");
		for(int i=0;i<books.length;i++)
		{
			System.out.println("Choose type of the book(p/e) : ");
			char ans = sc.nextLine().charAt(0);
			
			System.out.println("Enter book title : ");
			String title = sc.nextLine();
			
			System.out.println("Enter book price : ");
			float pr = Float.parseFloat(sc.nextLine());
			//System.out.println("Enter book Id : ");
			//int id = sc.nextInt();
			if(ans == 'p' || ans == 'P')
				books[i] = new PaperBook(title,pr);
			else if(ans == 'e' || ans == 'E')
				books[i] = new EBook(title,pr);
			else
				System.out.println("Invalid input");
		}
		
		for(int i=0; i<books.length ; i++)
		{
			System.out.println("*****************************");
			books[i].display();
			//System.out.println("ID::"+Book.bookid);
			System.out.println(" Cost : "+books[i].calCost());
		}
	}

}
		