
public class Node {
	private Student data;
	private Node next;
	public Node()
	{
		data=null;
		next=null;
	}
	public Node(Student data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return "  "+data;
		
	}
	public Student getData() {
		return data;
	}
	public void setData(Student data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
