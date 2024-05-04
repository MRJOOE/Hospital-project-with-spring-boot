package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.model.Pending;
import com.hospital.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	
	

	
	
	
	@PostMapping("/register")
	public String Register(@RequestBody Pending pending) {
		return registerService.Register(pending);
	}
}
