package com.cdec.clinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdec.clinic.model.Leave;

public interface LeaveRepo extends JpaRepository<Leave, Integer> {

}
