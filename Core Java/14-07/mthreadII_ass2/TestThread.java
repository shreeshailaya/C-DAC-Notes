package mthreadII_ass2;

import mthreadII_ass2.PrintDemo;
import mthreadII_ass2.ThreadDemo;

public class TestThread {
	public static void main(String[] args) {
		
	
	PrintDemo PD = new PrintDemo();

    ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD ,45);
    ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD ,12);
    ThreadDemo T3 = new ThreadDemo( "Thread - 3 ", PD ,36);
    
    T1.start();
    T2.start();
    T3.start();
    // wait for threads to end
    try {
       T1.join();
       T2.join();
       T3.join();
    } catch ( Exception e) {
       System.out.println("Interrupted");
    }
 }
}
