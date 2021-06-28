package assignment1_treeInt;

import java.util.Scanner;

public class BinaryTree {
	private Node root;
	
	public BinaryTree()
	{
		root=null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public void addTreeNode(int data)
	{
		Node newnode=new Node(data),move;
		char ans;
		Scanner sc = new Scanner(System.in);
		if(root==null)
		{
			root=newnode;
			System.out.println("ROOT CREATED");
		}
		else
		{
		  move=root;
		  while(true)
		  {
			  System.out.println("Do you want to enter in left or right in "+move.getData());
			  ans=sc.next().charAt(0);
			  if(ans=='l' || ans=='L')
			  {
				  if(move.getLeft()==null)
				  {
					  move.setLeft(newnode);
					  break;
				  }else 
				  {
					  move=move.getLeft();
				  }
			  }else if(ans=='r' || ans=='R')
			  {
				  if(move.getRight()==null)
				  {
					  move.setRight(newnode);
					  break;
					  
				  }else
				  {
					  move=move.getRight();
					  
				  }
			  }else
			  {
				  System.out.println("Wrong INPUT");
				  break;
			  }
			  
			  
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
