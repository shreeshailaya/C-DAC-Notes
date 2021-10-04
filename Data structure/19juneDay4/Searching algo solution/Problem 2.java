import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// taking user input using scanner class for integer
     Scanner sc2 = new Scanner(System.in);// taking user input using scanner class for string
    int n;
    System.out.println("Enter array size");
    n = sc.nextInt(); // input size of the array
    
    String arr[]= new String[n];
    System.out.flush();
    for(int i=0;i<n;i++)
    {  System.out.println("Enter Strings of the array");
        arr[i]=sc2.nextLine(); //entering N strings
    }
   
    System.out.println("Enter String to be searched");

    String to_find=sc2.nextLine(); // input string to be searched
    boolean flag=false;
    for(int i=0;i<n;i++)
    {
        if(to_find.equals(arr[i])) // if we find the string we set a boolean flag to true 
        {
            flag=true;
        }
    }
    if(flag==true)
    {
        System.out.println("Element found " + to_find+" in the array");
    
    }
    else
    {
    System.out.println("Element is not present");

    }
  }
}