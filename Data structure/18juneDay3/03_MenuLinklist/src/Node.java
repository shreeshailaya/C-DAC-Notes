

public class Node {
	int data;
	Node next;
	public int getData() {
		return data;
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
	public Node(int data) {
		//super();
		this.data = data;
		this.next =null;
	}
	
	public Node()
	{
		data=0;
		next=null;
	}@Override
	public String toString() {
	
		return data+" ";
	}


}
