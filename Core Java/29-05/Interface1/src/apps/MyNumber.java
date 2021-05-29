package apps;

public class MyNumber implements IntOperations {

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num/2==0)
		{	
		return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num/2==0)
		{	
		return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}else {
				flag=0;;
			}
		}
		if(flag==1)
		{
			return false;
		}else {
			return true;
		}
	}

	@Override
	public double calFactorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

}
