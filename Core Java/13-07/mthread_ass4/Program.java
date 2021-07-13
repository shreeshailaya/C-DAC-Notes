package mthread_ass4;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt1 = new MyThread(5);
		MyThread mt2 = new MyThread(6);
		MyThread mt3 = new MyThread(7);
		
		
		mt1.getT().start();
	
		mt2.getT().start();

		mt3.getT().start();
		
		
		try {
			mt1.getT().join();
			mt2.getT().join();
			mt3.getT().join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread mainth = new Thread();
		System.out.println(mainth.getName()+"  <--- Main Thread name");

		/*
		
		Thread mainth = new Thread();
		while(mt1.getT().isAlive() || mt2.getT().isAlive() || mt3.getT().isAlive())
		{
			System.out.println(mainth.getName()+"     Main Thread name");
		}
		
		*/
		
	
	}

}
