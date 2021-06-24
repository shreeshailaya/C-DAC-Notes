package assignment1DynamicStack;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,choise,id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		no= sc.nextInt();
		
		MyStack ms = new MyStack(no);
		
		do
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("ENTER 0 FOR EXIT");
			
			choise=sc.nextInt();
			
			switch(choise)
			{
			case 1:
				System.out.println("Enter ID and NAME of Empolyee");
				id=sc.nextInt();
				name=sc.next();
				ms.push(id, name);
				//System.out.println("TOP++++++"+ms.getTop());
				break;
			case 2: 
				//ms.pop();
				System.out.println("Poped Empolyee is "+ms.pop().getEmpid());
				break;
			case 3:
				ms.display();
				break;
			}
			
		
		}while(choise!=0);
		
		
		
	}

}
