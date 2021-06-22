package assignment2;

public class MyStack {
	
	private int arr [];
	private int top,size;
	
	public MyStack()
	{
		arr=new int[5];
		this.size=size;
		this.top=-1;
	}
	
	public MyStack(int size)
	{
		this.size=size;
		arr = new int[size];
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
			return true;
		else
			return false;
	}
	
	public void push(int element)
	{
		if(isFull()==true)
		{
			System.out.println("Stack is full");
			
		}
		else
		{
			top++;
			arr[top]=element;
		}
	}
	
	public int pop()
	{
		int element=-9999;
		if(isEmpty()==false)
		{
			element= arr[top];
			top--;
		}else
		{
			System.out.println("Stack is empty");
		}
		return element;
	}

	
	
	public void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println("  "+arr[i]);
		}
	}
}