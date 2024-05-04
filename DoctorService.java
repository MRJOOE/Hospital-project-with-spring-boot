package com.hospital.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.model.Doctor;
import com.hospital.repositories.DoctorRepository;
import com.hospital.serviceInterface.IDoctorService;

@Service
public class DoctorService implements IDoctorService{
	
	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public  List<Doctor> GetAllDoctors(){
		return doctorRepository.findAll();
	}
		
}
