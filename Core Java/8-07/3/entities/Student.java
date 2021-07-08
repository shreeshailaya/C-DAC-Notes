package entities;

public class Student {
	private int id;
	private String name;
	private float marks;
	private Grades grade;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		if(marks > 90)
			this.grade = Grades.EXCELLENT;
		else if(marks >= 70 && marks <= 90)
			this.grade = Grades.GOOD;
		else if(marks >= 50 && marks < 70)
			this.grade = Grades.AVERAGE;
		else
			this.grade = Grades.FAIL;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
	
	
	
	

}
