package com.cdec.clinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int dr_id;
	@Column
	private String specialization;
	@Column
	private String qualification;
	@Column
	private String experience;
	@Column
	private Double fees;
	@Column
	private String time_slot;
	@Column
	private int approval_status;
	
	/*Registratin Doctor */
	
	public Doctor(int dr_id, String specialization, String qualification, String experience, Double fees,
			String time_slot) {
		super();
		this.dr_id = dr_id;
		this.specialization = specialization;
		this.qualification = qualification;
		this.experience = experience;
		this.fees = fees;
		this.time_slot = time_slot;
	}
	
	


/* update doctor */



	public Doctor(String specialization, String qualification, String experience, Double fees,int dr_id) {
		super();
		
		this.specialization = specialization;
		this.qualification = qualification;
		this.experience = experience;
		this.fees = fees;
		this.dr_id = dr_id;
	}









	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}








	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDr_id() {
		return dr_id;
	}


	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public Double getFees() {
		return fees;
	}


	public void setFees(Double fees) {
		this.fees = fees;
	}


	public String getTime_slot() {
		return time_slot;
	}


	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}


	@Override
	public String toString() {
		return "DoctorRegistration [id=" + id + ", dr_id=" + dr_id + ", specialization=" + specialization
				+ ", qualification=" + qualification + ", experience=" + experience + ", fees=" + fees + ", time_slot="
				+ time_slot + "]";
	}
	
	
	
	
	

}
