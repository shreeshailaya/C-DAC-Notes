package assignment2;

public class Students {
	private int rollNo;
	private String name;
	private double marks;
	
	
	public Students(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}


	public int getRollNo() {
		return rollNo;
	}


	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}


	public String getName() {
		return name;
	}


	public double getMarks() {
		return marks;
	}
	
	

}
