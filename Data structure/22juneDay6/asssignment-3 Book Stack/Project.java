package self;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choise,no;
		String book;
		
		System.out.println("Create Stack of x numbers");
		no=sc.nextInt();
		MyStack mst = new MyStack(no);
		do
		{
			
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("PRESS 0 FOR EXIST");
			choise=sc.nextInt();
			
			switch(choise)
			{
			case 1:
				System.out.println("Enter Book want to push in stack");
				book=sc.next();
				mst.push(book);
				break;
				
			case 2:
				mst.pop();
				System.out.println("Top POPed up");
				break;
			case 3:
				mst.display();
				break;
			}
			
			
		}while(choise!=0);

	}

}
