package com.cdec.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdec.clinic.model.Account;
import com.cdec.clinic.model.Appointments;
import com.cdec.clinic.repo.AppointmentMapRepo;
import com.cdec.clinic.repo.AppointmentRepo;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentMapRepo arepo;
	
	@Autowired
	AppointmentRepo postAppointmentRepo;
	
	
	
	
	public List<Account> getAll()
	{
		return arepo.getAllAppoit();
	}




	public Appointments bookApp(Appointments app) {
		// TODO Auto-generated method stub
		return  postAppointmentRepo.save(app);
	}




	public List<Appointments> getDoctorApp(int dr_id) {
		// TODO Auto-generated method stub
		return arepo.getDoctorApp(dr_id);
	}

	

	/*
	public Account bookApp(Account acc) {
		
		return arepo.save(acc);
	}
	*/

	

}
