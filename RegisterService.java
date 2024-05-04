package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.model.Pending;
import com.hospital.repositories.PendingRepository;
import com.hospital.serviceInterface.IRegisterService;

@Service
public class RegisterService implements IRegisterService   {
	
	@Autowired
	PendingRepository pendingRepository;

	@Override
	public String Register(Pending pending) {
		try {
			if(isPasswordValid(pending.getPassword()))
			{pendingRepository.save(pending);
			return "Registered Successfully";
			}
			else {
				return "Make Sure Your Password is Greater than 8";
			}
		}
		catch (Exception e) {
			return "Make Sure Your Data is Correct";
		} 
			}
	
	public boolean isPasswordValid(String Password) {
		if(Password.length()>8) return true;
		else 	return false;	
	}
	
	
}
