package com.hospital.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.repositories.AdminRepository;
import com.hospital.repositories.DoctorRepository;
import com.hospital.serviceInterface.ILoginService;

@Service
public class LoginService implements ILoginService {
	
	@Autowired
	DoctorRepository doctorRepository;
	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public  String Login( Map<String, String> json){
		if((!doctorRepository.findByEmail(json.get("Email")).isEmpty() && !doctorRepository.findByPassword(json.get("Password")).isEmpty() )|| (!adminRepository.findByEmail(json.get("Email")).isEmpty() && !adminRepository.findByPassword(json.get("Password")).isEmpty() )) {
			return "Login Successfully" ;
		}
		else {
		return "Login Failed" ;
	}}

	
	
}
