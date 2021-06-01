package apps;

import myexceptions.InvalidUsernameException;

public class UserExceptionDemo {

	public static void main(String[] args) {
		//args[0] - username - should have only alphebets
		String uname = args[0];
		boolean flag = true;  //valid
		for(int i=0;i<uname.length();i++)
		{
			char ch = uname.charAt(i);
			if(!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <=122)))
			{
				flag = false;  //invalid
				break;
			}
		}
		//System.out.println(flag);
		try
		{
			if(flag == false)
			{
				throw new InvalidUsernameException();
			}
			else
			{
				System.out.println("User name is valid");
			}
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			//System.out.println(e);  //e.toString()
			e.printStackTrace();  //detail about exception
		}
	}

}
