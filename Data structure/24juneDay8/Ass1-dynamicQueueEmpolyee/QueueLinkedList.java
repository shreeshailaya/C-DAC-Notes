package dynamicQueueEmpolyee;

public class QueueLinkedList {
	
	Node rear,front;
	
	public QueueLinkedList()
	{
		rear=null;
		front=null;
		
	}
	
	
	public boolean isEmpty()
	{
		if(rear==null && front==null)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void enQueue(Empolyee data)
	{
		Node newnode= new Node(data);
		if(isEmpty()==true)
		{
			rear=front=newnode;
		}else
		{
			rear.setNext(newnode);
			rear=newnode;
			
		}
	}
	
	public Empolyee deQueue()
	{
		Empolyee data=null;
		if(isEmpty()==true)
		{
			System.out.println("Queue is empty");
			return data;
		}else
		{
			Node del;
			del=front;
			front = front.getNext();
			data=del.getData();
			
			del=null;
		}
		return data;
	}
	
	public void display()
	{
		if(isEmpty()==true)
		{
			System.out.println("Queue is EMPTY");
		}else
		{
			Node move=front;
			while(move!=null)
			{
				System.out.print("  [ "+move.getData().getId()+"     "+move.getData().getName()+"   ]   ");
				move=move.getNext();
				
			}
		}
		
	}
	
	
	public String toString()
	{
		String str="";
		Node move=front;
		while(move!=null)
		{
			str=str+move.getData().toString();
		}
		return str;
	}

}
