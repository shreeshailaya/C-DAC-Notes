import java.util.Scanner;

public class Linklist {
	private Node head;
	
	public void addEnd(int data)
	{
		Node newnode, move;
		newnode = new Node(data);
		if (head == null)
			head = newnode;
		else
		{
			move = head;
			while (move.getNext() != null)
				move = move.getNext();
			move.setNext(newnode);
			newnode.setPrev(move);
		}
	}
	public void createLinklist(int noofnodes)
	{
		int data=1;
		for (int i = 1; i <= noofnodes; i++)
		{
			addEnd(data);
			data=data+1;
		}
		
	}
	public void display()
	{
		Node move = head;
		System.out.println();
			System.out.println(" Linklist Is :");
		while (move.getNext()!= null)
		{
			System.out.print(" "+move.getData()+ "-->");
			move = move.getNext();
		}
		if(move.getNext()==null)
			System.out.println(" "+move.getData());
	}
	public int countNode()
	{
		int cnt = 0;
		Node move = head;
		while (move != null)
		{
			cnt++;
			move = move.getNext();;
		}
		return cnt;

	}
	public int modify(int data)
	{
		int newdata;
		Scanner sc=new Scanner(System.in);
		Node move=head;
		int found=0;
		while(move!=null)
		{
			if(move.getData()==data)
			{
				System.out.println("Enter New Data ");
				newdata=sc.nextInt();
				move.setData(newdata);
				found=1;
				break;
			}
			move=move.getNext();
		}
		sc.close();
		return found;
	}
	public void insert(int data, int pos)
	{
		Node newnode, move;
		int cnt = countNode();
		if (pos > cnt+1)
		{
			System.out.println("Not Available !!! ");
			return;
		}
		newnode = new Node(data);
		if (pos == 1)
		{
			if (head == null)
				head = newnode;
			else
			{
				newnode.setNext(head);
				head.setPrev(newnode);
				head = newnode;
			}
		}
		else
		{
			move = head;
			for (int i = 1; i < pos - 1; i++)
				move = move.getNext();
			newnode.setNext(move.getNext());
			newnode.setPrev(move);
			move.setNext(newnode);
			if (newnode.getNext() != null)
				(newnode.getNext()).setPrev(newnode);
		}
	}
	public void delete(int data)
	{
		Node del=null, temp=null;
		if (head == null)
		{
			System.out.println("Link List Is empty !!! ");
		}
		else
		{
			temp = head;
			if (head.getData() == data)
			{
				del = head;
				head = head.getNext();
				head.setPrev(null);
			    del=null;
			}
			else
			{
				while (temp != null)
				{
					if ((temp.getNext()).getData() == data)
					{
						del = temp.getNext();
						temp.setNext(del.getNext());

						if (temp.getNext() != null)
							temp.getNext().setPrev(head);
						 del=null;
						break;
					}
					temp = temp.getNext();
				}
			}
		}

	}
	public void split()
	{
		Linklist oddNum=new Linklist();
		Linklist evenNum=new Linklist();
		Node move=head;
		while(move!=null)
		{
			if(move.getData()%2==0)
				evenNum.addEnd(move.getData());
			else
				oddNum.addEnd(move.getData());
			move=move.getNext();
		}
		
	oddNum.display();
     evenNum.display();		
	}

	public void printReverse()
	{
		Node move=head;
		while (move.getNext() != null)
			move = move.getNext();
		while (move != null)
		{
			System.out.println("  "+move.getData());
			move = move.getPrev();
		}
	}
	public void sort()
	{;
		Node Temp, Tag;
		if (head != null)
		{
			for (Temp = head; Temp.getNext() != null; Temp = Temp.getNext())
			{
				for (Tag = Temp.getNext(); Tag != null; Tag = Tag.getNext())
				{
					if (Temp.getData() >Tag.getData())
					{
						int temp;
						temp = Temp.getData();;
						Temp.setData(Tag.getData());
						Tag.setData(temp);
					}
				}
			}
		}
	};
}
