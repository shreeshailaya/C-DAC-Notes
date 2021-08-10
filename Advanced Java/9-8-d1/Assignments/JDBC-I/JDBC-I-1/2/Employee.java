

public class Employee{
	private int id;
	private String name;
	private int sal;
	private int dept;
	public Employee(int id, String name, int sal, int dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	public int getSal() {
		return sal;
	}
	public int getId() {
		return id;
	}	
	
}
