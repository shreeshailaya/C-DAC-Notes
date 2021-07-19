import java.util.Scanner;

public class Selection_Sort {

	

		public static void SelectionSort(int a[],int size)
		{
			int i,j,min,index;
			for(i=0;i<size;i++)
			{
			   min=a[i];
			   index=i;
			   for(j=i+1;j<size;j++)
				   {
				   if(a[j]<min)
				   {
					   min=a[j];
					   index=j;
				   }
				}
			   a[index]=a[i];
			   a[i]=min;
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
			SelectionSort(arr, size);
			display(arr, size);
			
			
			
				
		}
		


}
