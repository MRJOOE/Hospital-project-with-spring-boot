package com.hospital.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.model.Pending;
import com.hospital.repositories.PendingRepository;
import com.hospital.serviceInterface.IPendingService;

@Service
public class PendingService implements IPendingService {
	
	@Autowired
	PendingRepository pendingRepository;
	
	
	@Override
	public List<Pending> getPendingDoctor(){
		return pendingRepository.findAll();
	}
	
	
	@Override
	public void Decline(int id) {
		pendingRepository.deleteById(id);
	}
	@Override
	public void Accept(int id) {
		pendingRepository.Accept(id);
		Decline(id);
	}
	
	
}
