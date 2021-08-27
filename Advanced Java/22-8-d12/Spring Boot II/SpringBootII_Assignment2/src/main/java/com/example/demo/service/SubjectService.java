package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;


@Service
public class SubjectService {

	@Autowired
	SubjectRepository sr;
	
	public List<Subject> getAll(){
		return sr.findAll();
	}
	
	public Subject save(Subject s) {
		return sr.save(s);
	}
}
