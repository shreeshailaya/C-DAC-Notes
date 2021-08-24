package model;

public class User 
{
	private String uid,pwd,fname,lname,email,contact;
	private Address add;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uid, String pwd, String fname, String lname, String email, String contact, String area,
			String city, String pincode)
	{
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		setAdd(new Address(area,city,pincode));
	
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getEmail() {
		return email;
	}

	public void setEmial(String emial) {
		this.email = emial;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	
	
}
