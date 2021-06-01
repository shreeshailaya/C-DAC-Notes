package myexceptions;

public class InvalidUsernameException extends Exception 
{
	private String msg;
	
	public InvalidUsernameException()
	{
		msg = "Username should not consist of non-alphebets";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "InvaliUsernameException : "+msg;
	}
	
	
}
