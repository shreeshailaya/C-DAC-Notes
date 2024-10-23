package Assignment1;


public class main{
public static void main(String[] args) {
    doubleQueue dequeobj = new doubleQueue();
    
    dequeobj.push_front(10);
    dequeobj.push_back(20);
    dequeobj.push_front(5);
    dequeobj.push_back(30);
    
    System.out.println("Front element: "+dequeobj.front()); 
    System.out.println("Back element: "+dequeobj.back());   
    
    System.out.println("Pop front: " +dequeobj.pop_front());  
    System.out.println("Pop back: " +dequeobj.pop_back());    
    
    System.out.println("Front element after pops: " +dequeobj.front());  
    System.out.println("Back element after pops: " +dequeobj.back());    
}
}