package beans;

public class User {
	private String uid,fname,lname,contact,email;  //properties
	private Address address;
			
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uid, String fname, String lname, String contact, String email, Address address) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}



	//getter and setter methods
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
