public class Node {
	int data;
	Node next,prev;
	public int getData() {
		return data;
	}
	public Node()
	{
		this.data = 0;
		this.next=null;
		this.prev=null;
	
	}
	public Node(int data)
	{
	this.data = data;
	this.next=null;
	this.prev=null;
	}
	public void setData(int data) {
		this.data = data;
			}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	@Override
	public String toString() {
	
		return "   "+data;
	}
}
