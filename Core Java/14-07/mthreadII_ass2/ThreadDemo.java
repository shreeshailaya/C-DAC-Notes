package mthreadII_ass2;

public class ThreadDemo extends Thread {

	private Thread t;
	   private String threadName;
	   PrintDemo  PD;
	   int num;
	   
	   public ThreadDemo( String name,  PrintDemo pd,int num) {
		      threadName = name;
		      PD = pd;
		      this.num=num;
		   }
		   
		   public void run() {
		      synchronized(PD) {
		         PD.print(num);
		      }
		      System.out.println("Thread " +  threadName + " exiting.");
		   }

		   public void start () {
		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
		}