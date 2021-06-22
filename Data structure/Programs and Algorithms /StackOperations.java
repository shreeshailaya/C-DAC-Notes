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


/*
________________________________________________________________________________________

*/


package self;

public class MyStack {
	
	
	private String [] book;
	private int top,size;
	
	public MyStack()
	{
		book=null;
		top=-1;
		size=0;
	}
	
	public MyStack(int size)
	{
		this.size=size;
		this.book = new String[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		
		if(top==size-1)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void push(String element)
	{
		if(isFull()==true)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			book[top]=element;
			
		}
	}
	
	public String pop()
	{
		String element="Empty";
		if(isEmpty()==true)
		{
			System.out.println("Stack is Empty");
			return element;
		}else
		{
			element = book[top];
			top--;
		}
		return element;
	}
	

	public void display()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack is EMPTY");
		}else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println("   "+book[i]);
			}
		}
	}
	
}

