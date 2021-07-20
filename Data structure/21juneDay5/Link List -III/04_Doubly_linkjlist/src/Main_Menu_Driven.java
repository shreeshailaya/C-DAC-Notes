import java.util.Scanner;

public class Main_Menu_Driven {
	public static void main(String[] args) {
		   

	Linklist Dlist1=new Linklist();
	int no;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of Nodes To Insert in Linklist ");
	no=sc.nextInt();
	Dlist1.createLinklist(no);

	int ch, ele, pos;

	do
	{
		System.out.println("*****************************************"+
		"\n1:Insert (position)"+
	    "\n2:Delete"+
	    "\n3: Display"+
	    "\n4: Modify"+
		"\n5 : Print Reverse"+
		"\n6 : Sort"+
		"\n0 : EXIT");
	    System.out.println("Enter your choice::   ");
		ch=sc.nextInt();
		switch (ch)
		{
		case 1:
			System.out.println("Enter Data  and Potision to insert data  ");
			ele=sc.nextInt();
			pos=sc.nextInt();
			Dlist1.insert(ele, pos);
			break;
		case 4:
			System.out.println(" Enter Data to modify ");
			ele=sc.nextInt();
			int found=Dlist1.modify(ele);
			if(found==1)
				System.out.println("Record Modified ");
			else
				System.out.println("Record Not Found ");
			break;
		case 2:
			System.out.println("Enter Data to Delete ");
			ele=sc.nextInt();
			Dlist1.delete(ele);
			break;
		case 3:
			Dlist1.display();
			break;
		case 6:
			Dlist1.sort();
			break;
		case 5:
			Dlist1.printReverse();
			break;
		}
	}
	while (ch != 0);
sc.close();
  }

}
