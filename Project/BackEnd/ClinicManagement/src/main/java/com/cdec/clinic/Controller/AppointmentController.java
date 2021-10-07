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


/**
 * Handles all appointment operations
 */
@CrossOrigin("*")
@RestController()
@RequestMapping("/auth/v1")
public class AppointmentController {

	/**
	 * The {@link AppointmentService} that handles the appointment related services
	 */
	@Autowired
	AppointmentService aservice;

	/**
	 * Get all accounts.
	 *
	 * @return all accounts
	 */
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


	/**
	 * Book appointments
	 *
	 * @param app the {@link Appointments} to be booked
	 * @return {@link Appointments} the booked appointment
	 */
	@PostMapping("/book_app")
	public Appointments bookApp(@RequestBody Appointments app)
	{
		return aservice.bookApp(app);
	}

	/**
	 * Get the appointments of a doctor
	 *
	 * @param dr_id the doctor id
	 * @return the appointments of the doctor
	 */
	@GetMapping("/getdr_app")
	public List<Appointments>getDoctorApp(@RequestParam int dr_id)
	{
		return aservice.getDoctorApp(dr_id);
	}
	
	
	
}
