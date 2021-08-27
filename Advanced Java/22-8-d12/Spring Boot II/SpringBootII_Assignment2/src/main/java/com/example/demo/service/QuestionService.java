package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository queRepo;
	
	public List<Question> getAll(){
		return queRepo.findAll();
	}
	
	public Question save(Question q) {
		return queRepo.save(q);
	}	
}
