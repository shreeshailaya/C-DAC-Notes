public class ArrayMain
{
	public static void main(String args [])
	{
		System.out.println("In the main method");
		int [] arr = new int[3];
		arr[0]=2;
		arr[1]=4;
		arr[2]=6;	
		for(int i=0;i<=2;i++)
		{
			System.out.println("values is array are"+ arr[i]);
		}
		System.out.println("************************************");
		Array a1;	
		a1=new Array();
		a1.addArr();
		a1.displayArr();
		System.out.println("************************************");		
		
				
		
	}
}