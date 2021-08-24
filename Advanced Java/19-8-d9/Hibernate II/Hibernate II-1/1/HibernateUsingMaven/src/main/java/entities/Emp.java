package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(name="getEmpsInDept", query = "select ename from Emp where dept=:dept")


@Entity
@Table(name="emp1")
public class Emp {
	@Id
	int empid;
	@Column(name="ename")
	String ename;
	@Column
	String dept;
	@Column
	float salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empid, String ename, String dept, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
