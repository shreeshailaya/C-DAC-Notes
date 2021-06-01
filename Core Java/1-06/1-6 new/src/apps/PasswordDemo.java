package apps;
import backend.*;
public class PasswordDemo {
	public static void main(String[] args) {
		String password = args[0];
		try {
			if(password.length() >= 12)
				throw new PasswordTooLongException();
			
			else if (password.length()<8)
				throw new PasswordTooShortException();
			
			else	
				System.out.println("Password is: "+password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}