package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myProduct")
public class Product {
	
	@Id
	@Column
	int productid;
	@Column
	String pname;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int productid, String pname) {
	super();
	this.productid = productid;
	this.pname = pname;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", pname=" + pname + "]";
}

}
