package com.cdec.clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cdec.clinic.model.Users;
import com.cdec.clinic.repo.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository registerRepository;
	
	public ResponseEntity<Users> registerUser(Users users) {
		System.out.println(users);
		Users usr = registerRepository.save(users);
		return new ResponseEntity<Users>(usr, HttpStatus.CREATED);
	}

	public void updateUser(Users users) {
		registerRepository.updateUser(users.getEmail(),users.getPassword(),users.getFname(),users.getLname(),users.getAddress(),users.getU_id());
		
	}
	
	
	

}
