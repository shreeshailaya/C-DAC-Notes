package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "StudentDemo")
public class Student {

	@Id
	int id;	
	@Column
	String name;
	@Column
	String area;
	@Column
	String city;
	@Column
	String pincode;
	
	//@JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "YYYY-MM-dd")
	@Column
	Date bdate;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String area, String city, String pincode,Date bdate) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.bdate=bdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ ", bdate=" + bdate + "]";
	}
	
}
