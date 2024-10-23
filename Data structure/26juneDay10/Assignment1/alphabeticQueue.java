package Assignment1;

import java.util.PriorityQueue;

public class alphabeticQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Books");
        pq.add("Ant");
        pq.add("Umbrella");
        pq.add("Man");
        pq.add("Grass");

        System.out.println("Priority Queue Elements in alphabetical order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  
        }
    }
}
