package com.hospital.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	
	
	@PostMapping("/login")
	public String Login(@RequestBody Map<String, String> json ){
		return loginService.Login(json);
	}
	
	
	
	
}
