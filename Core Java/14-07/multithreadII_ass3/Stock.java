package multithreadII_ass3;

public class Stock {
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced;

	public Stock() {
		qtyProduced = qtyConsumed = 0;
		bProduced = false;
	}

	public synchronized void  produce() {
		try {
			if (bProduced) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		qtyProduced++;
		bProduced = true;
		System.out.println("Produced:" + bProduced);
		notify();
	}

	public synchronized void consume() {
		try {
			if (!bProduced) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		qtyConsumed++;
		bProduced=false;
		System.out.println("Consumed:"+qtyConsumed);
		notify();
	}
}
