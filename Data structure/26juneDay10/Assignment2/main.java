package Assignment2;

public class main {
    public static void main(String[] args) {
        IntegerQueue pq = new IntegerQueue();


        pq.add(100);
        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(2);


        System.out.println("Priority Queue Elements in descending order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); 
        }
    }
}
