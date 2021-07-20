import java.util.Scanner;

public class CircularLinklist {
	Node head;
	public CircularLinklist() {
		head=null;
		
	}

	public void CreateLinklist(int numberofNodes)
	{
		Student data;
		int rno;
		String name;
		Scanner sc=new Scanner(System.in);
		Node newnode,move;
		for(int i=1;i<=numberofNodes;i++)
		{
			System.out.println("Enter Roll Number and Name ");
			rno=sc.nextInt();
			name=sc.next();
			data=new Student(rno,name);
			newnode=new Node(data);
			if(head==null)
			{
				head=newnode;
				head.setNext(head);
			}
			else
			{
				move=head;
				while(move.getNext()!=head)
				{
					move=move.getNext();
				}
				move.setNext(newnode);
				newnode.setNext(head);
			}
		}
	}
		public String toString()
		{
			System.out.println("\n\n Circular Link List \n\n");
			String str="  ";
			Node move=head;
			while(move.getNext()!=head)
			{
				str=str+" "+move.getData()+"-->";
				move=move.getNext();
			}
			if(move.getNext()==head)
				str=str+" "+move.getData();
			return str;
		}	
			
			


}
