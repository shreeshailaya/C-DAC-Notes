
public class Linklist {
	private Node head;
	public Linklist()
	{
		head=null;
	}
	public void addNode(int data)
	{
		Node newnode,move;
		newnode=new Node(data);
		if(head==null)
			head=newnode;
		else
		{
			move=head;
			while(move.getLink()!=null)
			{
				move=move.getLink();
			}
			move.setLink(newnode);
		}
	}
	
	public void display()
	{
		//System.out.println(" ************** Link List **************\n\n");
		Node move=head;
		while(move!=null)
		{
			System.out.print("   "+move.getData());
			move=move.getLink();
		}
		System.out.println();
		
	}


}
