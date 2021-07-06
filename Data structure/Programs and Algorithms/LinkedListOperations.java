package linkedlist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my LinkedList");
		int choise,data,position;
		LinkedList ls = new LinkedList();
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("**********Enter Choise**********");
			System.out.println("1.create linkedlist of x number");
			System.out.println("2.Enter at start");
			System.out.println("3.Enter at Middle");
			System.out.println("4.Enter at End");
			System.out.println("5.Modify");
			System.out.println("6.Delete at Start");
			System.out.println("7.Delete at Middle");
			System.out.println("8.Delete at End");
			System.out.println("9.Count Linkedlist");
			System.out.println("10.Display LinkedList");
			System.out.println("Enter 0 for Exist");
			
			choise=sc.nextInt();
			if(choise<=10 && choise>=0)
			{
				switch(choise)
				{
				
				case 1:
					System.out.println("Enter No of Node to be created ");
					data=sc.nextInt();
					ls.createLinkedList(data);
					break;
				
				case 2:
					System.out.println("Enter at Data you want to add");
					data = sc.nextInt();
					ls.addBeg(data);
					break;
					
				case 3:
					System.out.println("Enter data And position");
					data=sc.nextInt();
					position=sc.nextInt();
					ls.addMid(data, position);
					break;
					
				case 4:
					System.out.println("Enter at End");
					data=sc.nextInt();
					ls.addEnd(data);
					break;
					
				case 5:
					System.out.println("Enter position and modified node data");
					position=sc.nextInt();
					data=sc.nextInt();
					ls.modify(data, position);
					break;
					
				case 6:
					System.out.println("Start deleted");
					ls.deleteBeg();
					break;
					
				case 7:
					System.out.println("Enter Middle position you wanted to delete");
					position=sc.nextInt();
					ls.deleteMid(position);
					System.out.println("Middle Deleted");
					break;
					
				case 8:
					System.out.println("End deleted");
					ls.deleteEnd();
					break;
					
				case 9: 
					System.out.println("The count of Linked list is"+ls.count());
					break;
					
				case 10:
					ls.display();
					break;
				}
			}
			
		}while(choise!=0);
		System.out.println("Thanks for visiting");
	}

}


/*
__________________________________________________________________________________________________________________

*/

package linkedlist;

public class LinkedList {
	
	Node head;
	int data;
	public LinkedList()
	{
		head=null;
	}
	
	public void addEnd(int data)
	{
		this.data=data;
		Node newnode,move;
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
	}
	
	public void addMid(int data,int position)
	{
		int pos=position;
		if(pos < count())
		{	
			this.data=data;
			Node move,newnode;
			newnode=new Node(data);
			if(head==null)
			{
				addEnd(data);
			}else
			{
				move=head;
				for(int i=1;i<pos-1;i++)
				{
					move=move.getNext();
					
				}
				newnode.setNext(move.getNext());
				move.setNext(newnode);
				
			}
		}else
		{
			System.out.println("Position Not Fount Linked list size is of "+count());
		}
	}
	
	
	public void addBeg(int data)
	{
		this.data=data;
		Node newnode=new Node(data);
		if(head==null)
		{
			addEnd(data);
		}else
		{
			newnode.setNext(head);
			head=newnode;
		}
	}
	
	
	
	public int count()
	{
		int countLS=0;
		Node move;
		move=head;
		if(head==null)
		{
			countLS=0;
		}else
		{
			while(move.getNext()!=null)
			{
				countLS=countLS+1;
				move=move.getNext();
			}
		}
		return countLS;
	}

	public void modify(int no,int position)
	{
		Node move=head;
		
		for(int i=0;i<position-1;i++)
		{
			move=move.getNext();
		}
		move.setData(no);
		
	}
	
	public void deleteBeg()
	{
		if(head==null)
		{
			System.out.println("Nothing in linked list");
		}
		else
		{
			Node del = head;
			head=head.getNext();
			del=null;
		}
	}
	
	public void deleteEnd() 
	{
		Node move=head,del;
		for(int i=0;i<count()-1;i++)
		{
			move=move.getNext();
		}
		del=move.getNext();
		move.setNext(del.getNext());
		del=null;
	}
	
	public void deleteMid(int position)
	{
		Node del;
		Node move=head;
		for(int i=1;i<position-1;i++)
		{
			move=move.getNext();
		}
		del=move.getNext();
		move.setNext(del.getNext());
		del=null;
		
	}
	
	
	public void createLinkedList(int terms)
	{
		int data=2;
		Node newnode,move;
		
		for(int i=0;i<=terms;i++)
		{
			newnode=new Node(data);
			if(head==null)
			{
				head=new Node(data);
			}else
			{
				move=head;
				while(move.getNext()!=null)
				{
					move=move.getNext();
				}
				move.setNext(newnode);
			}
			data=data+2;
		}
		
				
	}

	
	public void display()
	{
		Node move=head;
		while(move.getNext()!=null)
		{
			System.out.println("  "+move.getData());
			move=move.getNext();
		}
	}
	

}

/*
__________________________________________________________________________________________________________________

*/


package linkedlist;

public class Node {
	
	private int data;
	private Node next;
	
	
	public Node()
	{
		this.data=0;
		this.next=null;
	}
	public Node(int data)
	{
		this.data= data;
		this.next=null;
	}
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
__________________________________________________________________________________________________________________

*/


