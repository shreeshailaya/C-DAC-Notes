import java.util.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
               
    int arr[] = new int[20]; // decalring an array of 20 integers
    for (int i = 0; i < 20; i++) {
      arr[i] = sc.nextInt(); // taking input of 20 integers
    }
    System.out.println("Element to be searched");
    int key=sc.nextInt(); 
    // Binary search
    // we initialize two pointers start = starting index of the sorted array and end =  ending index of the sorted array
    int start=0;
    int end=19; 
    boolean flag=false; // we make a boolean value to check if we actually found the element
    while(start<=end)
    {
        int mid=(start+end)/2; // we first check that whether the middle element will be our ans
        if(arr[mid]==key)
        {
            flag=true; // if we find that arr[mid] is the required query we break out of the loop as the search is now complete
            break;
        }
        // Otherwise there are two conditions 
        else if(arr[mid]>key) // middle element (arr[mid]>key) we know that element cannot be in right half
        {
            end=mid-1; // Hence we shift end to mid-1 position and repeat finding the element
            
        }
        else  // lastly if the key > arr[mid] which means element must exist (if it does ) in right half
        start=mid+1; // // Hence we shift start to mid+1 position and repeat finding the element
    
    }
    if(flag)
    {
        System.out.println("Found");
        
}
else{
    System.out.println("Not present");
}
}
}
            