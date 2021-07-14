package multithreadII_ass3;

public class Consumer implements Runnable{
 Thread t;
 Stock s;
 boolean bRun;
 
 public Consumer(Stock stock ) {
	 this.s=stock;
	 this.bRun=true;
	 t=new Thread(this);
 }
 
 public Thread getThread() {
	 return this.t;
 }
 public void run() {
	 while(bRun)
		 s.consume();
 }
 public void stopNow() {
	 bRun=false;
 }
}
