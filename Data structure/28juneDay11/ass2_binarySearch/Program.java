package ass2_binarySearch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearch bst = new BinarySearch();
		bst.createBinarySearch(5);
		bst.createBinarySearch(10);
		bst.createBinarySearch(4);
		bst.createBinarySearch(15);
		bst.createBinarySearch(3);
		
		System.out.println("**** IN ORDER ***");
		bst.inOrder(bst.getRoot());
		
		System.out.println("**** PRE ORDER ***");
		bst.preOrder(bst.getRoot());
		
		System.out.println("**** POST ORDER ***");
		bst.postOrder(bst.getRoot());
		

	}

}
