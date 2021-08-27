package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;

@CrossOrigin
@RestController
public class SubjectController {

	@Autowired
	SubjectService subService;
	
	@GetMapping("/allSubject")	
	public List<Subject> getAll(){
		return subService.getAll();
	}
	
	@PostMapping("/saveSubject")
	public Subject save(@RequestBody Subject subject) {  //
		System.out.println(subject);
		/*Subject subject = new Subject();
		subject.setSname("Core Java");
		subject.setDescription(" Welcome To Core Java!!!");
		List<Question> ques = new ArrayList<Question>();
		Question que1 = new Question();
		que1.setQtext("What is Inheritance?");
		que1.setSubject(subject);
		ques.add(que1);
		Question que2 = new Question();
		que2.setQtext("What is Polymorphism?");
		que2.setSubject(subject);
		ques.add(que2);
		subject.setQs(ques);*/
		return subService.save(subject);
	}	
}
