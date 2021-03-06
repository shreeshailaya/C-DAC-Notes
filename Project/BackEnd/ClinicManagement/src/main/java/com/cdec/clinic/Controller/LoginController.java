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

/**
 * Handles all login related operations
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/auth/v1")
public class LoginController {
	
	@Autowired
	LoginService loginService;

	/**
	 * Login user using email and password
	 *
	 * @param email    the email
	 * @param password the password
	 * @return the response entity with logged in {@link Users}
	 */
	@GetMapping("/login")
	public ResponseEntity<Users> loginUser(@RequestParam String email, @RequestParam String password) {
		
		return loginService.loginUser(email,password);
	}

	/**
	 * Login user using {@link Users} info
	 *
	 * @param usr the {@link Users} info
	 * @return the response with logged in {@link Users}
	 */
	@PostMapping("/login1")
	public ResponseEntity<Users> loginUser(@RequestBody Users usr) {
		
		return loginService.loginUser1(usr);
	}


	/**
	 * Forget password helps to login with contact number
	 *
	 * @param contact_no the contact number to login with
	 * @return the response entity with logged in {@link Users}
	 */
	@GetMapping("/forget_password")
	public ResponseEntity<Users> forgetPassword(@RequestParam String contact_no)
	{
		return loginService.forgetPassword(contact_no);
	}

	/**
	 * Get the user by user id
	 *
	 * @param user_id the id of the user
	 * @return the {@link Users}
	 */
	@GetMapping("/get_by_id")
	public List<Users> getUserById(@RequestParam int user_id)
	{
		return loginService.getUserById(user_id);
	}

	/**
	 * Get all patients information
	 *
	 * @return the list of {@link Users}
	 */
	@GetMapping("/get_patient_info")
	public List<Users> allPatients()
	{
		return loginService.allPatients();
	}
	
	

	
	
	
	
	
}
