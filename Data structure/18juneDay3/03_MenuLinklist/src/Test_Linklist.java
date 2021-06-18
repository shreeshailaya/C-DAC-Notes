import java.util.Scanner;

public class Test_Linklist
{
		public static void main(String[] args) {
		LinkList list1=new LinkList();
		Node move=null;
		int ch,data,pos,no;
		System.out.println("Enter No Of Node To Create ");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		list1.createLinkList(no);
		System.out.println(list1);
		do
		{
			System.out.println("\n\n\t1.AddBeg\t5. count Nodes\t9 .Delete Beg"
					+ "            \n\t2. AddMid\t6.Print Reverse\t10. Delete Mid"
					+ "            \n\t3. AddEnd\t7. Reverse\t11. Delete End"
					+ "            \n\t4. Display\t8.Modify"
					+ "  \n\tEnter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 9:
				list1.deleteBeg();
				break;
			case 10:
				System.out.println("Enter Position to Delete Node ");
				pos=sc.nextInt();
				list1.deleteMid(pos);
				break;
			case 11:
				list1.deleteEnd();
				break;
			case 1:
				System.out.println("Enter Data  To Insert ");
				data=sc.nextInt();
				list1.addNodeAtBeg(data);
				break;
			case 2:
				System.out.println("Enter Data  To Insert And Position ");
				data=sc.nextInt();
				pos=sc.nextInt();
				list1.addNodeAtMid(data,pos);
				break;
			
			case 3:
				System.out.println("Enter Data  To Insert ");
				data=sc.nextInt();
				list1.addNodeAtEnd(data);
				break;
			case 5:
				 no=list1.countNode();
				 System.out.println(" Count : "+no);
				 break;
			case 4:
				list1.display();
				//System.out.println(list1);
				break;
			case 6:
				list1.printReverse(move=list1.getHead());
				break;
			case 7:
				list1.reverse();
				break;
			
			}
			
		}while(ch!=0);
			}
}
