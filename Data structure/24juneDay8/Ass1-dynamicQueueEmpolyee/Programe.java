package dynamicQueueEmpolyee;

import java.util.Scanner;

public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choise,id;
		String name;
		Scanner sc = new Scanner(System.in);
		QueueLinkedList qll = new QueueLinkedList();
		
		do 
		{
			System.out.println("\n1.enQueue");
			System.out.println("2.deQueue");
			System.out.println("3.Display");
			System.out.println("ENTER 0 FOR EXIT");
			
			choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				System.out.println("Enter ID and NAME");
				id=sc.nextInt();
				name=sc.next();
				Empolyee emp= new Empolyee(id,name);
				qll.enQueue(emp);
				break;
				
			case 2:
				Empolyee data=qll.deQueue();
				System.out.println("***** DELETED EMPOLYEE ID:-"+data.getId()+"*****");
				break;
			case 3:
				qll.display();
			
			}
			
			
		}while(choise!=0);
		

	}

}
