package com.cdec.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cdec.clinic.model.Users;
import com.cdec.clinic.repo.RegisterRepository;

@Service

public class LoginService {

	@Autowired
	RegisterRepository registerRepository;
	
	public ResponseEntity<Users> loginUser(String email, String password) {
		Users usr = registerRepository.findByEmail(email);
		
		if(email.equals(usr.getEmail()) && password.equals(usr.getPassword())) {
			return new ResponseEntity<Users>(usr,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	
	public ResponseEntity<Users> loginUser1(Users user) {
		Users usr = registerRepository.findByEmail(user.getEmail());
		
		if(user.getEmail().equals(usr.getEmail()) && user.getPassword().equals(usr.getPassword())) {
			return new ResponseEntity<Users>(usr,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}


	public ResponseEntity<Users> forgetPassword(String contact_no) {
		// TODO Auto-generated method stub
		Users usr = registerRepository.findByContact(contact_no);
		return new ResponseEntity<Users>(usr,HttpStatus.ACCEPTED);	
		}


	public List<Users> getUserById(int u_id) {
		// TODO Auto-generated method stub
		return  registerRepository.findUserById(u_id);
	}


	public List<Users> allPatients() {
		// TODO Auto-generated method stub
		return registerRepository.allPatients();
	}





}
