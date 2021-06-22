package assignment2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack ms = new MyStack(10);
		int ct=0,n=0,i=1,j=1;  
		while(n<10)  
		{  
			j=1;  
			ct=0;  
		while(j<=i)  
		{  
			if(i%j==0)  
			ct++;  
			j++;   
		}  
			if(ct==2)  
		{  
				ms.push(i);
				n++;  
		}  
			i++;  
		} 
		
		ms.display();
	}  


}


