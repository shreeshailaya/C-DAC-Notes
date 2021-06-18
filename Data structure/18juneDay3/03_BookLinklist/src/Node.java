
public class Node
{
	private Book data;
	private Node next;
	public Node()
	{
		data=new Book();
		next=null;
	}
	public Node(Book data)
	{
		this.data=data;
		this.next=null;
	}
	public String toString()
	{
		return data.toString();
	}
	public Book getData()
	{
		return data;
		
	}
	public void setData(Book data)
	{
		this.data=data;
	}
	public Node getNext()
	{
		return next;
		
	}
	public void setNext(Node next)
	{
		this.next=next;
	}
		
}