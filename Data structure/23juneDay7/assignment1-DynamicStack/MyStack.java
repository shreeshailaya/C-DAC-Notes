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
