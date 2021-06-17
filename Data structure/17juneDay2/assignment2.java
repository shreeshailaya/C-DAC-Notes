package assignment2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1 = new LinkedList();
		l1.createLinkedList(5);
		l1.display();

	}

}

/*
______________________________________________________________________

*/

package assignment2;

public class Node {
	
	private int data;
	private Node next;
	
	
	public Node()
	{
		data=5;
		next=null;
	}
	
	public Node(int data)
	{
		this.data=data;
	}
	
	
	// Getter and Setters 

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

}


/*
___________________________________________________________________________

*/

package assignment2;

public class LinkedList {

	//private Node head;
	public LinkedList()
	{
		head=null;
	}
	Node head;
	public void createLinkedList(int terms)
	{
		int data=5;
		int i;
		Node newnode=null,move=null;
		for(i=1;i<=terms;i++)
		{
			newnode=new Node(data);
			if(head==null)
			{
				head=newnode;
			}else {
				move=head;
				while(move.getNext()!=null) 
				{
					move=move.getNext();
				}
				move.setNext(newnode);
			}
			data=data+5;
		}
	}
	
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.println(" "+move.getData());
			move=move.getNext();
		}
	}
	
}
