package com.cdec.clinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdec.clinic.model.Appointments;
import com.cdec.clinic.model.AppointmentsMap;

public interface AppointmentRepo extends JpaRepository<Appointments,Integer>{

}
