package com.example.demo.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subjectid")
	int subid;
	
	@Column(name="subjectname")
	String sname;
	
	@Column(name="description")
	String description;
		
	//@JsonIgnoreProperties("subject")
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
	List<Question> qs = new ArrayList<Question>();
	
	public Subject() {
		super();
		
	}
	
	public Subject(String sname, String description, List<Question> qs) {
		super();
		this.sname = sname;
		this.description = description;
		this.qs = qs;
	}

	public int getSubid() {
		return subid;
	}

	public void setSubid(int subid) {
		this.subid = subid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQs() {
		return qs;
	}

	public void setQs(List<Question> qs) {
		this.qs = qs;
		for(Question q:qs)
			q.setSubject(this);
	}

	
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", sname=" + sname + ", description=" + description + "]";
	}	
}
