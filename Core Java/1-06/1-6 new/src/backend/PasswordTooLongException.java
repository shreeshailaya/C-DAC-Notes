package backend;

public class PasswordTooLongException extends Exception {
	private String msg;
	
	public PasswordTooLongException()
	{
		msg = "Atmost 12 characters only";
	}
	public String getMessage() {
		return msg;
	}
	public String toString() {
		return "PasswordTooLongException : "+msg;
	}
}