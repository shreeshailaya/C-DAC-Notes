package assignment1_treeInt;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bt = new BinaryTree();
		bt.addTreeNode(5);
		bt.addTreeNode(10);
		bt.addTreeNode(15);
		bt.addTreeNode(20);
		System.out.println("*** IN ORDER***");
		bt.inOrder(bt.getRoot());
		
		System.out.println("*** PRE ORDER ***");
		bt.preOrder(bt.getRoot());
		
		System.out.println("*** POST ORDER ***");
		bt.postOrder(bt.getRoot());

	}

}
