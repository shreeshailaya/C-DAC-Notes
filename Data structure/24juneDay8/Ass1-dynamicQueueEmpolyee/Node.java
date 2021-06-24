package dynamicQueueEmpolyee;

public class Node {
	
	Empolyee data;
	Node next;
	
	public Node()
	{
		next=null;
		data=null;
		
	}
	
	public Node(Empolyee data)
	{
		this.data=data;
		this.next=null;
		
	}
	
	
	public String toString()
	{
		return "  "+data.toString();
	}

	public Empolyee getData() {
		return data;
	}

	public void setData(Empolyee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
