package ass1MenuDrivenTree;
import ass1MenuDrivenTree.*;

public class BinarySearch {
	
	Node root;
	
	public BinarySearch()
	{
		root=null;
	}
	
	public void setRoot(Node top)
	{
		this.root=top;
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	
	public void createBinarySearch(int data)
	{
		
		Node newnode=new Node(data);
		Node move;
		if(root==null)
		{
			root=newnode;
			System.out.println("TOP CREATED");
		}
		else
		{
			move=root;
			if(data<move.getData())
			{
				while(move.getLeft()!=null)
				{
					move=move.getLeft();
				}
				move.setLeft(newnode);
				System.out.println(data+"   is added to LEFT "+root.getData());
			}
			else if(data>move.getData())
			{
				while(move.getRight()!=null)
				{
					move=move.getRight();
				}
				move.setRight(newnode);
				System.out.println(data+"     added to right of "+root.getData());
			}
		}
	}
	
	public int smallNumber()
	{
		Node move=root;
		while(move.getLeft()!=null)
		{
			move=move.getLeft();
		}
		return move.getData();
		
	}
	
	public int largeNumber()
	{
		Node move=root;
		while(move.getRight()!=null)
		{
			move=move.getRight();
		}
		
		return move.getData();
	}
	
	public void searchElement(int data)
	{
		Node move;
		move=root;
		if(data==move.getData())
		{
			System.out.println("\t The Element is Root i.e:- "+move.getData());
		}
		else
		{
			move=root;
			while(move!=null && move.getData()!=data)
			{
				if(data>move.getData())
				{
					move=move.getRight();
				}
				else
				{
					move=move.getLeft();
				}
			}
			if(move==null) 
			{
				System.out.println("Data is not in tree");
			}else 
			{
				System.out.println("Data  found");
			}
			
			
		}
	
	}
	
	
	
	
	
	public void inOrder(Node root)
    {
    	Node move=root;
    	if(move!=null)
    	{
    		inOrder(move.getLeft());
    		System.out.println("  "+move.getData());
    		inOrder(move.getRight());
    	}
    }
	
	 public void preOrder(Node root)
	    {
	    	Node move=root;
	    	if(move!=null)
	    	{
	    		System.out.println("  "+move.getData());
	    		preOrder(move.getLeft());
	    		preOrder(move.getRight());
	    	}
	    }
	 
	 public void postOrder(Node root)
	    {
	    	Node move=root;
	    	if(move!=null)
	    	{
	    		postOrder(move.getLeft());
	    		postOrder(move.getRight());
	    		System.out.println("  "+move.getData());
	    	}
	    }
}
