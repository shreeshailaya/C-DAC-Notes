package apps;

public class TryCatchDemo {

	public static void main(String[] args)
	{
		try
		{
			int n1 = Integer.parseInt(args[0]);//10
			if(n1 == 10)
			    throw new NullPointerException();
			int n2 = Integer.parseInt(args[1]);//5
			System.out.println("trying to divide....");
			System.out.println("Division : "+(n1/n2));
			System.out.println("End");
		}
		//catch block will not run if exception does not occur
		//specific catch block
		/*catch(ArithmeticException e) 
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}*/
		//improved catch block, handling of exceptions is similar
		catch(ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)//any other exceptions
		{
			System.out.println("generalized catch block");
			e.printStackTrace();
		}
		System.out.println("after try-catch block");
	}

}
