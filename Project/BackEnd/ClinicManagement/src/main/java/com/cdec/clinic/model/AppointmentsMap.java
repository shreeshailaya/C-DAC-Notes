package com.cdec.clinic.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name="appointments")
public class AppointmentsMap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int app_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="u_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	Account account;
	
	
	@Column
	private int dr_id;
	
	@Column
	private Date app_date;
	
	@Column
	private String app_time;
	


	public AppointmentsMap() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AppointmentsMap(Account account, int dr_id, Date app_date, String app_time) {
		super();
		
		this.account = account;
		this.dr_id = dr_id;
		this.app_date = app_date;
		this.app_time = app_time;
	}



	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	




	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public int getDr_id() {
		return dr_id;
	}

	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	



	public String getApp_time() {
		return app_time;
	}



	public void setApp_time(String app_time) {
		this.app_time = app_time;
	}



	@Override
	public String toString() {
		return "Appointments [app_id=" + app_id + ", account=" + account + ", dr_id=" + dr_id + ", app_date=" + app_date
				+ ", app_time=" + app_time + "]";
	}






	
	
	

}
