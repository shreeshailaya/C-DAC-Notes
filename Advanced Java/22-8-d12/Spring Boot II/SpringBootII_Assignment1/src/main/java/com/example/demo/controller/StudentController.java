package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.service.StudentService;

@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	StudentService studService;	
	
	@GetMapping("/all")
	public List<Student> getAll(){
		return studService.getAll();
	}	
	
	@PostMapping("/save")
	public Student addStudent(@RequestBody Student s) {
		System.out.println(s);
		return studService.save(s);
	}
	
	@GetMapping("/get")
	public Student getById(@RequestParam("sid") int id) {
		return studService.getById(id);
	}
	
	//http://localhost:8080/getStudent/1 or 
	//http://localhost:8080/getStudent/1/Monika/Pune and so on
	@GetMapping("/getStudent/{sId}")
	public Student getByIdUsingPathVariable(@PathVariable("sId") int id) {
		return studService.getById(id);
	}	
	
	@GetMapping("/getStudentFromPune")
	public List<Student> getStudentsByCity() {
	
		return studService.getStudentsByCity();
	}
	
	@GetMapping("/getStudentByCity")
	public List<Student> getStudentsByCity(@RequestParam("city") String city) {
	
		return studService.getStudentsByCity(city);
	}
	
	@GetMapping("getStudentsById")
	List<Student> getStudentsById(){
		return studService.getStudentsById();
	}	
}
