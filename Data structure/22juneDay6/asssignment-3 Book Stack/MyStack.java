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
