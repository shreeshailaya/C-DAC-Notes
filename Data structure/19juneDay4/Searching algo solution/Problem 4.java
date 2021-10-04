import java.util.*;

class Main {
  public static void main(String[] args) {
     Map<Integer, Integer> mp = new HashMap<>();// creating a hashmap to store the key and value pairs
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[20]; // decalring an array of 20 integers
    for (int i = 0; i < 20; i++) {
      arr[i] = sc.nextInt();  // taking inout from the user of 20 integers
    }
    
    System.out.println("Enter Element to be searched ");
    int query = sc.nextInt(); // taking input of the element to be searched

    for (int i = 0; i < 20; i++) {
      if (mp.containsKey(arr[i])) {   // if the element is already present in the hashmap we increment its frequency
        mp.put(arr[i], mp.get(arr[i]) + 1); 
      } else {
        mp.put(arr[i], 1); // if the element is not present in the hashmap we add it to the hashmap and assign it's frequency as 1
      }
    }
    // we check if the element to be searched is present in the hashmap or not
    if (mp.containsKey(query)) {
          // if element is present
      System.out.println("Element found");
    } else {
      System.out.println("Element is not present");
    }
  }
}