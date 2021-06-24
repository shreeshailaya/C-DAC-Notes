package queueWithArrray;

public class MyQueue {
	private String  str;
	private char [] arr;
	private int size,front,rear;
	
	public MyQueue()
	{
		this.arr=new char[10];
		str=null;
		front=-1;
		rear=-1;
	}
	
	public MyQueue(String str)
	{
		
		this.str=str;
		front=-1;
		rear=-1;
	}
	

	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public char[] deCompose(String str)
	{
		char [] ch= new char[str.length()];
		arr = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			
			
		}
		
		enQueue(ch);
		return ch;
	}
	
	public void enQueue(char ch[])
	{
		while(rear!=arr.length-1)
		{
		if(rear==-1)
		{
			front++;
			rear++;
			arr[rear]=ch[rear];
		}else
		{
			rear++;
			arr[rear]=ch[rear];
		}
		}
	}
	
	public char deQueue()
	{
		char data='@';
		if(front == -1 && rear == -1)
		{
			System.out.println("QUEUE is EMPTY");
			return data;
		}else
		{
			
			data=arr[front];
			front++;
			
		}
		return data;
	}
	
	
	public void display()
	{
		int move=front;

		for(int i=move;i<=rear;i++)
		{
			System.out.print("   [ "+arr[i]+" ] ");
		}
	}
}
