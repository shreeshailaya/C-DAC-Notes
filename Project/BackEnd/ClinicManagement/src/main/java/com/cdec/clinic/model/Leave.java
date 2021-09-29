package com.cdec.clinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dr_leave")
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private Date from_date;
	@Column
	private Date to_date;
	@Column
	private String reason;
	@Column
	private int approval_status;
	
	
	public Leave(String fname, String lname, Date from_date, Date to_date, String reason, int approval_status) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.from_date = from_date;
		this.to_date = to_date;
		this.reason = reason;
		this.approval_status = approval_status;
	}
	
	
	


	public Leave(int id, String fname, String lname, Date from_date, Date to_date, String reason) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.from_date = from_date;
		this.to_date = to_date;
		this.reason = reason;
	}





	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Date getFrom_date() {
		return from_date;
	}


	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}


	public Date getTo_date() {
		return to_date;
	}


	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public int getApproval_status() {
		return approval_status;
	}


	public void setApproval_status(int approval_status) {
		this.approval_status = approval_status;
	}


	@Override
	public String toString() {
		return "Leave [id=" + id + ", fname=" + fname + ", lname=" + lname + ", from_date=" + from_date + ", to_date="
				+ to_date + ", reason=" + reason + ", approval_status=" + approval_status + "]";
	}
	
	
	
	
	
}
