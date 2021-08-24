package beans;

public class Address {
	String are,city,pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String are, String city, String pin) {
		super();
		this.are = are;
		this.city = city;
		this.pin = pin;
	}

	public String getAre() {
		return are;
	}

	public void setAre(String are) {
		this.are = are;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
