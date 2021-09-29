package com.cdec.clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdec.clinic.model.Account;
import com.cdec.clinic.model.Appointments;
import com.cdec.clinic.model.AppointmentsMap;
import com.cdec.clinic.service.AppointmentService;




@CrossOrigin("*")
@RestController()
@RequestMapping("/auth/v1")
public class AppointmentController {

	@Autowired
	AppointmentService aservice;
	
	@GetMapping("/allapp")
	public List<Account> getAll(){
		return aservice.getAll();
	}
	
	/*
	@PostMapping("/book_app")
	public Account bookApp(@RequestBody Account acc)
	{
		return aservice.bookApp(acc);
	}
	*/
	
	
	@PostMapping("/book_app")
	public Appointments bookApp(@RequestBody Appointments app)
	{
		return aservice.bookApp(app);
	}
	
	@GetMapping("/getdr_app")
	public List<Appointments>getDoctorApp(@RequestParam int dr_id)
	{
		return aservice.getDoctorApp(dr_id);
	}
	
	
	
}
