package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	// Java Persistence Query Language similar like HQL Make use of Class and Properties.
	@Query("Select s from Student s where city='Pune'")
	public List<Student> getStudentsByCity();
	
	
	@Query("Select s from Student s where city= ?1")
	public List<Student> getStudentByCity(String city);
	
	// SQL Query Make use of actual table name and column name
	@Query(value = "Select * from student_demo Where id > 2",nativeQuery = true)
	public List<Student>  getStudentsById();
}
