package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studRepo;
	
	
	public Student save(Student s) {
		return studRepo.save(s);
	}
	
	public List<Student> getAll(){
		
		return studRepo.findAll();
	}
	
	
	public Student getById(int id) {
		Optional<Student> stud =  studRepo.findById(id);
		Student s = null;
		try {
			s = stud.get();
		}catch (Exception e) {
			s=null;
		}
		return s;
	}
	
	public List<Student> getStudentsByCity(){
		return studRepo.getStudentsByCity();
	}
	
	public List<Student> getStudentsByCity(String city){
		return studRepo.getStudentByCity(city);
	}
	
	public List<Student> getStudentsById(){
		return studRepo.getStudentsById();
	}

}