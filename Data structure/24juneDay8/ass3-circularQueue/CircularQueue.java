package circularQueue;

public class CircularQueue {
	private int rear,front,size;
	private int [] arr;
	
	public CircularQueue()
	{
		rear=-1;
		front=-1;
		arr=null;
		size=1;
	}
	
	public CircularQueue(int size)
	{
		this.size=size;
		this.arr=new int[size];
		rear=-1;
		front=-1;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void enQueue(int data)
	{
		if(rear==-1)
		{
			rear++;
			front++;
			arr[rear]=data;
		}else
		{
			rear=(rear+1)%size;
			arr[rear]=data;
		}
	}
	
	public int deQueue()
	{
		int data=-999;
		if(isEmpty()==true)
		{
			return data;
		}
		else 
		{
			data=front;
			front++;
		}
		return data;
	}
	
	public void display()
	{
		
		for(int i=front; i!=rear+1 ; i= (i+1)%size) 
		{
			System.out.print("   [  "+arr[i]+"   ]  ");
		}
	}

}
