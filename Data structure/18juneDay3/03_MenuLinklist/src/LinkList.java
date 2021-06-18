import java.util.Scanner;

public class LinkList {

	Node head;
	public LinkList()
	{
		head=null;
	}
	public Node createNode(int data)
	{
		Node record;
		record=new Node(data);
		return record;
	}
	public void addNodeAtEnd(int data)
	{
		Node newnode,move;
		newnode=createNode(data);
		if(head==null)
			head=newnode;
		else
		{
			move=head;
			while(move.getNext()!=null)
				move=move.getNext();
			move.setNext(newnode);
		}
	}
	public void createLinkList(int no)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int data;
		for(i=1;i<=no;i++)
		{
			System.out.println("\n\n\t Enter Data ");
			data=sc.nextInt();
			addNodeAtEnd(data);
		}
		//System.out.println("Node Added At End !!! ");
		
			
	}
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.println("  "+move.getData());
			move=move.getNext();
		}
	}
	
	public void addNodeAtBeg(int data)
	{
		Node newnode;
		newnode=createNode(data);
		if(head==null)
			head=newnode;
		else
		{
			newnode.setNext(head);
			head=newnode;
		}
	//	System.out.println("Node Added At Beginning !!! ");
		
	}
	public void addNodeAtMid(int data,int pos)
	{
		Node newnode,move;
		int cnt=countNode();
		
		
		if(pos>=cnt+1)
		{
			System.out.println("Not Allowed ");
			return;
				
		}
		else
		{
		newnode=createNode(data);
		if(head==null)
			head=newnode;
		else if(pos==1)
			addNodeAtBeg(data);
		else 
		{
			move=head;
			for(int i=0;i<pos-1;i++)
				move=move.getNext();
			newnode.setNext(move.getNext());
			move.setNext(newnode);
		//	System.out.println("Node Added At Mid  !!! ");
			
		}
				
		}
	}
	public void printReverse(Node move)
	{
		if(move!=null)
		{
			printReverse(move.getNext());
			System.out.println("   "+move.getData());
		}
	}
	public void reverse()
	{
		Node prev,curr,next;
		prev=head;
		curr=prev.getNext();
		next=prev.getNext().getNext();
		while(curr!=null)
		{
			curr.setNext(prev);
			prev = curr;
			curr = next;
			if (next != null)
				next = next.getNext();
    	}
		head.setNext(null);
		head = prev;

	}
	
		public Node getHead()
	{
		return head;
	}
	public int countNode()
	{
		int cnt=0;
		Node move=head;
		while(move!=null)
		{
			cnt++;
			move=move.getNext();
		}
		return cnt;
		
	}
	@Override
	public String toString()
	{

		String str="";
		Node move=head;
		while(move!=null)
		{
			str=str+move.toString();
			move=move.getNext();
		}
		
		// TODO Auto-generated method stub
		return str;
	}


public void deleteBeg()
{
	Node del;
    if(head==null)
    	System.out.println("Linklist is Empty !!! ");
    else
    {
    	del=head;
    	head=head.getNext();
     }
}


public void  deleteMid(int pos)
{
	Node  move, del;
	move = head;
	for (int i = 1; i < pos - 1; i++)
		move = move.getNext();
	del = move.getNext();
	move.setNext(del.getNext());
}
public void deleteEnd()
{
	int pos = countNode();
	Node move, del;
	move = head;
	for (int i = 1; i < pos - 1; i++)
		move = move.getNext();

	del = move.getNext();
	move.setNext(del.getNext());
}

	
}