package backend;

public class PasswordTooShortException extends Exception {
	String msg;

	public PasswordTooShortException() {
		msg = "Atleast 8 characters only";
	}
	public String getMessage() {
		return msg;
	}
	public String toString() {
		return "PasswordTooShortException: "+msg;
	}
}