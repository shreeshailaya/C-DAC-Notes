package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	QuestionService queService;
	
	@GetMapping("/allQuestion")	
	public List<Question> getAll(){
		return queService.getAll();
	}
	
	@PostMapping("/saveQuestion")
	public Question save(@RequestBody Question question) {
		System.out.println(question);
		return queService.save(question);
	}	
	
}
