package com.cdec.clinic.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdec.clinic.model.Users;
import com.cdec.clinic.service.RegisterService;
@CrossOrigin("*")
@RestController()
@RequestMapping("/auth/v1")
public class RegisterController {

	 @Autowired
	 RegisterService registerService;
	 
	 
	 @PostMapping(value="/registeration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Users> registerUsers(@RequestBody Users users ) throws Exception {
		 if(users == null) {
			 throw new Exception();
		 }
		 return registerService.registerUser(users);
	 }
	 
	 
	 
	 
	 @PostMapping(value="/update_user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public void updateAccount(@RequestBody Users users) throws Exception
	 {
		 if(users == null)
		 {
			 throw new Exception();
		 }
		 registerService.updateUser(users);
		 //return "updated";
	 }
}
