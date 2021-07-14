package multithreadII_ass3;

public class ProgramDemo {
	public static void main(String[] args) throws InterruptedException {
		Stock s=new Stock();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		
		p.getThread().start();
		c.getThread().start();
		
		System.out.println("***************begin*******************");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.stopNow();
		c.stopNow();
		
		p.getThread().join();
		c.getThread().join();
		
		System.out.println("*****************end*********************");
		
		System.out.println("Total qty produced:"+s.qtyProduced);
		System.out.println("Total qty Consumed:"+s.qtyConsumed);
	}
}
