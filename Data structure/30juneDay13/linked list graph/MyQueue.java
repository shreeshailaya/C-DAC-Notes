
public class MyQueue {
	private int size;
	private char arr[];
	private int rear,front;
	
	public MyQueue (int size)
	{
		this.size=size;
		arr=new char [size];
		rear=-1;
		front=-1;
	}
	public MyQueue()
	{
		this.size=3;
		arr=new char [size];
		rear=-1;
		front=-1;
	}
	public void enQueue (char ele)
	{
		if(isFull()==false)
		{
			rear++;
			arr[rear]=ele;
		}
		else
		{
		System.out.println("\nqueue is full");

		}
	}

	public char  deQueue()
	{
		if(isEmpty()==false)
		{
			return arr[++front];
		}
		else 
			return '0'; 
	
	}

	public boolean  isEmpty ()
	{
		if(rear==front)
			return true;
		else
			return false;

	}
	public boolean  isFull ()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	}

	public String toString()
	{
	int i;
	String str=" ";
		if(isEmpty()==false)
		{
			for(i=front+1;i<=rear;i++)
			str=str+'\t'+arr[i];
		}
		else
		{
			str ="Queue is empty";
		}
	
      return str;
         	  
      }


}
