package multithread_1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread cthread = Thread.currentThread();
		System.out.println("Name : "+cthread.getName());
		System.out.println("Prority  :  "+cthread.getPriority());
		
		cthread.setName("Shree");
		cthread.setPriority(7);
		
		System.out.println("Name : "+cthread.getName());
		System.out.println("Prority  :  "+cthread.getPriority());
		
		

	}

}
