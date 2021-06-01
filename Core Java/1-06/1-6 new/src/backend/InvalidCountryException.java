package backend;

public class InvalidCountryException extends Exception {
	String msg;
	
	public InvalidCountryException()
	{
		msg = "User outside INDIA cant register";
	}
	public String getMessage() {
		return msg;
	}
	public String toString() {
		return "InvalidCountryException : "+msg;
	}
}