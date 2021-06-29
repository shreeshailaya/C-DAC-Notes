package ass1MenuDrivenTree;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choise,no;
		BinarySearch bst = new BinarySearch();
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("\n\t1.Add Node in tree");
			System.out.println("\t2.Search Node in tree");
			System.out.println("\t3.Display tree");
			System.out.println("\t4.Find Samallest Number");
			System.out.println("\t5.Find Largest Number");
			System.out.println("\tENTER 0 FRO EXIST");
			
			choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				System.out.println("\tEnter Element to Insert");
				no=sc.nextInt();
				bst.createBinarySearch(no);
				System.out.println(no+"  added to tree");
				break;
			case 2:
				System.out.println("\tEnter Number to search");
				no=sc.nextInt();
				bst.searchElement(no);
				break;
			case 3:
				int dspno;
				System.out.println("\t1.inOrder");
				System.out.println("\t2.preOrder");
				System.out.println("\t3.postOrder");
				dspno=sc.nextInt();
				
				switch(dspno)
				{
				case 1:
					System.out.println("\t***** inOrder *****");
					bst.inOrder(bst.getRoot());
					break;
				case 2:
					System.out.println("\t***** preOrder *****");
					bst.preOrder(bst.getRoot());
					break;
				case 3:
					System.out.println("\t***** postOrder *****");
					bst.postOrder(bst.getRoot());
					break;
				default:
					System.out.println("\tEnter Correct Choise");
					break;
				}
				break;
				
			case 4:
				System.out.println("\t SMALLEST NUMBER IS:-  "+bst.smallNumber());
				break;
			case 5:
				
				System.out.println("\t LARGEST NUMBER IS:-   "+bst.largeNumber());
				break;
			default:
				if(choise!=0)
				{
				System.out.println("\t Enter Correct choise");
				}
				break;
				
			}
			
		}while(choise!=0);
		
		
		

	}

}
