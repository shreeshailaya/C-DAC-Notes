package coll2_1;

import asstwo_3.Customer;

public class Student {
	
	private int id;
	String name,city;
	double percentage;

	
	public Student(int id, String name, String city, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]";
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			if(this.id==id)
			{
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public int hashCode() {
		int code =0;
		if(city.equalsIgnoreCase("pune"))
		{
			code=10;
		}
		else if(city.equalsIgnoreCase("Solapur"))
		{
			code=20;
		}
		else if(city.equalsIgnoreCase("Mumbai"))
		{
			code=30;
		}else
		{
			code=100;
		}
		return code;
	}
	
	
	
	
	
	

}
