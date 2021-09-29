package com.cdec.clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdec.clinic.model.Users;
import com.cdec.clinic.service.LoginService;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth/v1")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public ResponseEntity<Users> loginUser(@RequestParam String email, @RequestParam String password) {
		
		return loginService.loginUser(email,password);
	}
	
	@PostMapping("/login1")
	public ResponseEntity<Users> loginUser(@RequestBody Users usr) {
		
		return loginService.loginUser1(usr);
	}
	
	
	@GetMapping("/forget_password")
	public ResponseEntity<Users> forgetPassword(@RequestParam String contact_no)
	{
		return loginService.forgetPassword(contact_no);
	}
	
	@GetMapping("/get_by_id")
	public List<Users> getUserById(@RequestParam int user_id)
	{
		return loginService.getUserById(user_id);
	}
	
	@GetMapping("/get_patient_info")
	public List<Users> allPatients()
	{
		return loginService.allPatients();
	}
	
	

	
	
	
	
	
}
