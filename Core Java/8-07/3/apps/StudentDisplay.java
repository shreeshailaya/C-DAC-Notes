package apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import entities.Student;

public class StudentDisplay {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll no of student : "); 
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("Enter name of student : "); 
		String name = br.readLine();
		System.out.println("Enter marks of student : ");
		float marks = Float.parseFloat(br.readLine());

		Student student = new Student(rollno,name,marks);
		System.out.println(student);
	}

}
