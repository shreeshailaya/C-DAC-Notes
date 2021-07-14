package multithreadII_ass4;

public class lamdaExp {
 public static void main(String[] args) {
	Thread t=new Thread(()->{
		int n;
		for(int i=2; i<100; i++) {
			n=1;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					n=0;
				}
			}
			if(n==1)
				System.out.println("prime NO:"+i);
		}
	});
	t.start();
}
}
