package apps;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//throw - for explicitly throwing the exception
		//will not ask to handle
		//throw new RuntimeException();
		
		try
		{
			throw new Exception();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//anonymous object
		new String("welxome");
     }
}


