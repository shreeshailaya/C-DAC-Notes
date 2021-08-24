package model;

public class Address 
{
   private String area,city,pincode;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(String area, String city, String pincode) {
	super();
	this.area = area;
	this.city = city;
	this.pincode = pincode;
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
   
}
