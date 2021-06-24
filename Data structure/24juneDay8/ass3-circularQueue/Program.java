package circularQueue;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue cq = new CircularQueue(5);
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		cq.enQueue(5);
		
		
		cq.display();
		
		cq.deQueue();
		
		System.out.println("\n After dqueue");
		
		cq.display();

	}

}
