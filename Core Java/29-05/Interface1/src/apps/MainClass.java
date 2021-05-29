package apps;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntOperations io = new MyNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean prime= io.isPrime(num);
		if (prime==true)
		{
			System.out.println("The Number is Prime");
		}else {
			System.out.println("No is not prime");
		}
		//boolean even = io.isEven(num);
		if(io.isEven(num)==true) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is odd");
		}
		
		System.out.println("The factorial of number is "+io.calFactorial(num));
	}

}
