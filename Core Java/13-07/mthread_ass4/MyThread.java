package mthread_ass4;

public class MyThread implements Runnable{
	private int no;
	private Thread t;
	public MyThread(int no) {
		// TODO Auto-generated constructor stub
		this.no=no;
		t= new Thread(this);
		
		
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=no;i>=0;i--)
		{
			System.out.println("Thread No  :- "+no+"     ThreadOutput     "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public Thread getT() {
		return t;
	}
	
	

}
