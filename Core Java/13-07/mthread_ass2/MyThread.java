package mthread_ass2;

public class MyThread extends Thread
{

	@Override
	public void run() {
			for(int i=0;i<7;i++)
			{
				
				System.out.println("MyTread Class"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}

	
	
	
	
}
