package asstwo_3;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name, email,contact;

	public Customer(String name, String email, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String toString()
	{
		return "Name:-  "+name;
	}
	

}
