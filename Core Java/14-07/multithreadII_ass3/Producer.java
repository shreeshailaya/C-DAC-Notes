package multithreadII_ass3;

public class Producer implements Runnable {
	Thread t;
	Stock s;
	boolean bRun;

	public Producer(Stock s) {
		this.s = s;
		t = new Thread(this);
		bRun = true;
	}

	public Thread getThread() {
		return t;
	}

	public void run() {
		while (bRun)
			s.produce();
	}

	public void stopNow() {
		bRun = false;
	}
}
