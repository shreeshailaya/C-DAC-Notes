import java.util.Scanner;

public class Linklist {
	private Node head;
	public Linklist()
	{
		head=null;
	}
	public void createLinklist(int numberOfNode)
	{
		Book data;
		int i;
		Node newnode,move;
		int bno;
		String bname;
		Scanner sc=new Scanner(System.in);
		
		for(i=1;i<=numberOfNode;i++)
		{
			System.out.println("Enter Book ID and name ");
			bno=sc.nextInt();
			bname=sc.next();
			
			data=new Book(bno,bname);
			
			newnode=new Node(data);
			if(head==null)
				head=newnode;
			else
			{
				move=head;
				while(move.getNext()!=null)
				{
					move=move.getNext();
				}
				move.setNext(newnode);
			}
	
					
			
		}
		
		
		
		
	}
	public void display()
	{
		System.out.println(" ************** Link List **************\n\n");
		Node move=head;
		while(move!=null)
		{
			System.out.println("   "+move.getData());
			move=move.getNext();
		}
	}

} 
 