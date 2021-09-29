package com.cdec.clinic.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdec.clinic.model.Account;
import com.cdec.clinic.model.Appointments;
import com.cdec.clinic.model.AppointmentsMap;

public interface AppointmentMapRepo extends JpaRepository<Account, Integer> {
	@Query(value="select a from Account a where a.appointments is not EMPTY")
	List<Account> getAllAppoit();
	
	@Query(value="select a from Account a ")
	List<Appointments> getDoctorApp(int dr_id);

	
	
}
