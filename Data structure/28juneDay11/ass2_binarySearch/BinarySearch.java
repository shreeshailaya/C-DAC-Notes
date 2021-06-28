package ass2_binarySearch;

import assignment1_treeInt.Node;

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
		
		Node newnode=new Node(data),move;
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
