package queueWithArrray;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyQueue mq = new MyQueue();
		mq.deCompose("Shree");
		mq.display();
		
		mq.deQueue();
		
		System.out.println("AFTERDQ");
		mq.display();

	}

}
