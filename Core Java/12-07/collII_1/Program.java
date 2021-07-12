package coll2_1;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student>std = new HashSet<>();
		
		std.add(new Student(1, "a", "pune", 1));
		std.add(new Student(2, "a", "mumbai", 1));
		std.add(new Student(3, "a", "nashik", 1));
		std.add(new Student(4, "a", "solapur", 1));
		std.add(new Student(5, "a", "pune", 1));
		std.add(new Student(6, "a", "pune", 1));
		std.add(new Student(7, "a", "mumbai", 1));
		std.add(new Student(8, "a", "solapur", 1));
		std.add(new Student(9, "a", "Satara", 1));
		std.add(new Student(10, "a", "Solapur", 1));

		
		for(Student s : std)
		{
			System.out.println(s);
		}
		
		

	}

}
