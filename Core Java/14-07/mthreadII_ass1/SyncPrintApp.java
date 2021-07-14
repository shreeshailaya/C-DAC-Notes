package mthreadII_ass1;
public class SyncPrintApp {

	public static void main(String[] args) {
		Printer p = new Printer();  //shared resource
		
		//multiple threads created by passing required data
		//newly created state
		PrintingJob j1 = new PrintingJob(p, "{", "welcome to java", "}");
		PrintingJob j2 = new PrintingJob(p,"[", "learning multithreading", "]");
		PrintingJob j3 = new PrintingJob(p,"(", "thread synchronization", ")");

		j3.getThread().setPriority(Thread.MAX_PRIORITY); 
		j1.getThread().setPriority(2);
		j2.getThread().setPriority(2);
		
		//runnable
		j1.getThread().start();
		j2.getThread().start();
		j3.getThread().start();
		
		System.out.println("Printing task begins.......");
		
		try 
		{
			j1.getThread().join();
			j2.getThread().join();
			j3.getThread().join();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Printing task ends.........");
		
	}

}
