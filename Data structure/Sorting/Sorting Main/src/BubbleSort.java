import java.util.Scanner;

public class BubbleSort {

	public static void BubbleS(int a[],int size)
	{
		int i,j,temp;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	public static void display(int a[],int size)
	{
		int i;
		System.out.println("\nArray Is : \n");
		for(i=0;i<size;i++)
			System.out.print(" "+a[i]);
	}
	
	public static void main(String[] args) {

		int size=5;
		int arr[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		display(arr, size);
		BubbleS(arr, size);
		display(arr, size);
		
		
		
			
	}
	


}
