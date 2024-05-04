package com.hospital.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.model.Doctor;
import com.hospital.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors()
	{
		return doctorService.GetAllDoctors();
	}
		
	}
	

