package com.hospital.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.model.Pending;
import com.hospital.service.PendingService;

@RestController
public class PendingController {
	
	@Autowired
	PendingService pendingService;
	

		

	@GetMapping("/pendingdoctors")
	public List<Pending> getPendingDoctors()
	{
		return pendingService.getPendingDoctor();
	}
	
	
	
	@PostMapping("/pending/{id}")
	public String Accept(@PathVariable int id)
	{
		pendingService.Accept(id);
		return "Accepted";
	}
	
	@DeleteMapping("/pending/{id}")
	public String Decline(@PathVariable int id)
	{
		pendingService.Decline(id);
		return "Declined";
	}
	
	}
	

