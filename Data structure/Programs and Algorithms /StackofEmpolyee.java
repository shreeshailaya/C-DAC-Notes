package assignment1DynamicStack;

public class Empolyee {
	private int empid;
	private String empname;
	
	public Empolyee()
	{
		empid=0;
		empname="null";
	}
	
	
	public Empolyee(int empid,String name)
	{
		this.empid=empid;
		this.empname=name;
	}
	
	
	public String toString()
	{
		
		return " Emp ID:_"+empid+" Emp Name"+empname;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}

/*
_______________________________________________________________________________________________

*/

package assignment1DynamicStack;

public class MyStack {
	
	private Empolyee [] emp;
	private int top,size;
	
	public MyStack()
	{
		size=3;
		emp=new Empolyee[size];
		top=-1;
	}
	
	public MyStack(int size)
	{
		this.size=size;
		top=-1;
		this.emp=new Empolyee[size];
		
		
	}
	
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public void push(int empid, String empname)
	{
		if(isFull()==true)
		{
			System.out.println("Stack is full");
		}else
		{
			top++;
			
			emp[top]= new Empolyee(empid,empname);
		}
	}
	public Empolyee pop()
	{
		Empolyee popx;
		
		if(isEmpty()==true)
		{
			//System.out.println("Stack is Empty");
			return null;
		}else
		{
			
			popx=emp[top];
			top--;
			return popx;
		}
	}
	
	public int getTop()
	{
		return top;
	}
	
	public void display()
	{
		if(isEmpty()==true)
			System.out.println("Stack is Empty");
		else
		{
			for(int i=top;i>=0;i--)
			{
			System.out.println("   Empolyee ID ->    "+emp[i].getEmpid()+"     Empolyee Name ->     "+emp[i].getEmpname());
			}
		}	
		}

}

}

/*
_______________________________________________________________________________________________

*/

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





/*  
 ++++OutPut++++
*/

Enter the size of Stack
3
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT
1
Enter ID and NAME of Empolyee
111
aaa
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT
1
Enter ID and NAME of Empolyee
222
bbb
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT
1
Enter ID and NAME of Empolyee
333
ccc
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT
3
   Empolyee ID ->    333     Empolyee Name ->     ccc
   Empolyee ID ->    222     Empolyee Name ->     bbb
   Empolyee ID ->    111     Empolyee Name ->     aaa
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT
2
Poped Empolyee is 333
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT
3
   Empolyee ID ->    222     Empolyee Name ->     bbb
   Empolyee ID ->    111     Empolyee Name ->     aaa
1.Push
2.Pop
3.Display
ENTER 0 FOR EXIT

