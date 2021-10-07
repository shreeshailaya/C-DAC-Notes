package com.cdec.clinic.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdec.clinic.model.Doctor;
import com.cdec.clinic.model.Users;
import com.cdec.clinic.service.DoctorService;


/**
 * Handles all doctor related operations
 */
@CrossOrigin("*")
@RestController()
@RequestMapping("/auth/v1")
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	/**
	 * Registers a doctor
	 *
	 * @param doctor the {@link Doctor} to be registered
	 * @return the saved {@link Doctor}
	 * @throws Exception the exception
	 */
	@PostMapping(value="/save_doctor", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor ) throws Exception {
		 if(doctor == null) {
			 throw new Exception();
		 }
		 return doctorService.registerDoctor(doctor);
	 }

	/**
	 * Updates the doctor details
	 *
	 * @param doctor the latest {@link Doctor} details
	 * @throws Exception the exception
	 */
	@PostMapping(value="/update_doctor",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateDoctor(@RequestBody Doctor doctor) throws Exception
	{
		if(doctor == null)
		{
			throw new Exception();
		}
		doctorService.updateDoctor(doctor);
	}

	/**
	 * Gets all information about a doctor
	 *
	 * @return the doctors info
	 */
	@GetMapping("/get_doctors_info")
	public List<Object> getDoctorsInfo()
	{
		return doctorService.getDoctorsInfo();
	}
	

	

}
