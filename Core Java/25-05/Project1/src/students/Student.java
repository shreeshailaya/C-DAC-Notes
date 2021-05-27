package students;

public class Student {
	String name;
	int rollNo;
	public Student(String name, int rollNo) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.rollNo=rollNo;
	}
	
	public void displayStudent()
	{
		System.out.println("Name of student:-"+name);
		System.out.println("Roll no of student:-"+rollNo);
		
	}

}
