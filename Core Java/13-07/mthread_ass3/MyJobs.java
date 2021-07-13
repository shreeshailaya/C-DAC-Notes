package mthread_ass3;

public class MyJobs implements Runnable {
	
	private Thread t;
	
	
	
	public MyJobs() 
	{
		// TODO Auto-generated constructor stub
		t= new Thread(this);
	
	}

	public Thread getT() 
	{
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stu
		
		for(int i=0;i<7;i++)
		{
			System.out.println("MyJobs Class"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
