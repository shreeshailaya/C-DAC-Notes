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

/**
 * The Appointments.
 */
@Entity
@Table(name="appointments")
public class Appointments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int app_id;
	
	@Column
	private int u_id;
	
	
	@Column
	private int dr_id;
	
	@Column
	private Date app_date;
	
	@Column
	private String app_time;

	/**
	 * Instantiates a new Appointments.
	 */
	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new Appointments.
	 *
	 * @param app_id   the appointment id
	 * @param u_id     the user id
	 * @param dr_id    the doctor id
	 * @param app_date the appointment date
	 * @param app_time the appointment time
	 */
	public Appointments(int app_id, int u_id, int dr_id, Date app_date, String app_time) {
		super();
		this.app_id = app_id;
		this.u_id = u_id;
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

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
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
		return "Appointments [app_id=" + app_id + ", u_id=" + u_id + ", dr_id=" + dr_id + ", app_date=" + app_date
				+ ", app_time=" + app_time + "]";
	}
	
	
	

}
