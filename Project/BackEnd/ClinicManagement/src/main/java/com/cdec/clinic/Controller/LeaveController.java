package com.cdec.clinic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdec.clinic.model.Leave;
import com.cdec.clinic.service.LeaveService;

@CrossOrigin("*")
@RestController()
@RequestMapping("/auth/v1")
public class LeaveController {
	
	@Autowired 
	LeaveService leaveService;
	
	@PostMapping("/apply_leave")
	public Leave applyLeave(@RequestBody Leave l)
	{
		return leaveService.applyLeave(l);
	}
	
	@GetMapping("/get_all_leave")
	public List<Leave> getAllLeave()
	{
		return leaveService.getAllLeaves();
	}
	

}
