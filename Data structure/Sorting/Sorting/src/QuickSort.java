
public class QuickSort {
	
	public static void q_Sort(int a[],int start,int end)
	{
		int left=start;
		int right=end;
		int pivot=a[start];
		while(left<right)
		{
			while(a[right]>=pivot && (left<right))
				right--;
			if(left!=right)
			{
				a[left]=a[right];
				left++;
			}
			while(a[left]<=pivot && (left<right))
				left++;;
			if(left!=right)
			{
				a[right]=a[left];
				right--;
			}
			
		}
		a[left]=pivot;
		if(start<left)
			q_Sort(a,start,left-1);
		if(end>left)
			q_Sort(a,right+1,end);
	}
	
	
	public static void quickSort(int arr[],int size)
	{
		q_Sort(arr,0,size-1);
	}
	
	
	public static void main(String[] args) {
		
	
		int arr[]= {7,6,9,3,4,12,-3,5,16,14};
		System.out.println("Array Is : \n");
		for(int i=0;i<arr.length;i++)
			System.out.print("  "+arr[i]);
		System.out.println(arr);
		quickSort(arr,10);
		System.out.println("Array Is : \n");
		for(int i=0;i<arr.length;i++)
			System.out.print("  "+arr[i]);
		
		
		
	}

}
