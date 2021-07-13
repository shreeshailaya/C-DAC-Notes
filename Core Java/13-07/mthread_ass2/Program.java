package mthread_ass2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread  t = new MyThread();
		t.start();
		
		
		for(int i=20;i>14;i--)
		{
			System.out.println("Program Main Class  "+i);
			System.out.println("");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
