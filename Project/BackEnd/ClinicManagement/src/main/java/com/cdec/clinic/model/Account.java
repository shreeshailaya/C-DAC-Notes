package com.cdec.clinic.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//remove column
@Entity
@Table(name="account")
public class Account {
	@Id
	private int user_id;
	@Column
	private int role_id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String contact_no;
	@Column
	private String address;
	@Column
	private String gender;
	@Column
	private Date dob;
	
	@OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
	List<AppointmentsMap> appointments;
	
	
	
	
	
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Account(int user_id, int role_id, String fname, String lname, String contact_no, String address,
			String gender, Date dob, List<AppointmentsMap> appointments) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
		this.fname = fname;
		this.lname = lname;
		this.contact_no = contact_no;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.appointments = appointments;
	}




	public Account(int user_id, int role_id, String fname, String lname, String contact_no, String address,
			String gender, Date dob) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
		this.fname = fname;
		this.lname = lname;
		this.contact_no = contact_no;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
	}
	
	
	
	
	
	
	public List<AppointmentsMap> getAppointments() {
		return appointments;
	}




	public void setAppointments(List<AppointmentsMap> appointment) {
		this.appointments = appointment;
		for(AppointmentsMap a : appointments)
			a.setAccount(this);
	}




	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Account [user_id=" + user_id + ", role_id=" + role_id + ", fname=" + fname + ", lname=" + lname
				+ ", contact_no=" + contact_no + ", address=" + address + ", gender=" + gender + ", dob=" + dob + "]";
	}
	

	

}
