package com.cdec.clinic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cdec.clinic.model.Doctor;
import com.cdec.clinic.model.Users;
import com.cdec.clinic.repo.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;

	/*
	 * public ResponseEntity<Users> registerUser(Users users) {
			System.out.println(users);
			Users usr = registerRepository.save(users);
			return new ResponseEntity<Users>(usr, HttpStatus.CREATED);
		}
	 */
	
	
	public ResponseEntity<Doctor> registerDoctor(Doctor doctor) {
		
		Doctor doct = doctorRepository.save(doctor);
		return new ResponseEntity<Doctor>(doct,HttpStatus.CREATED);
	}

	public void updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.updateDoctor(doctor.getSpecialization(),doctor.getQualification(),doctor.getExperience(),doctor.getFees(),doctor.getDr_id());
		
		
	}

	public List<Object> getDoctorsInfo() {
		return doctorRepository.getDoctorInfo();
		
	}



}
