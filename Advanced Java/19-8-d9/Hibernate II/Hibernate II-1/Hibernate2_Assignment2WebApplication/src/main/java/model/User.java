package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="user")
public class User {

	@Id	
	String u_id;
	@Column
	String password;
	@Column
	String email;
	@Column	
	String contact;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String u_id, String password, String email, String contact) {
		super();
		this.u_id = u_id;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", password=" + password + ", email=" + email + ", contact=" + contact + "]";
	}
	
	
}
