package com.cdec.clinic.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdec.clinic.model.Users;


@Transactional
@Repository
public interface RegisterRepository extends JpaRepository<Users, Integer> {
	
	public Users findByEmail(String email);
	
	@Modifying
	@Query(value="update Users usr set usr.email = ?1, usr.password = ?2, usr.fname = ?3, usr.lname = ?4, usr.address = ?5 where usr.u_id= ?6")
	public void updateUser(String email,String password, String fname, String lname, String address, int u_id);
	
	@Query("select u from Users u where contact_no = ?1")
	public Users findByContact(String contact_no);
	
	@Query("select u from Users u where u.u_id=?1")
	public List<Users> findUserById(int u_id);

	@Query("select u from Users u where u.role_id=3")
	public List<Users> allPatients();
	


	
	
	
	/*
	 {"u_id":1,"email":"s.r.vitkar55@gmail.com","password":"shree123","fname":"Shreeshail","lname":"Vitkar","contact_no":"9960988307","address":"Pune","gender":"male","dob":"2021-09-15T18:30:00.000+00:00","role_id":2}
	 */
	


}
