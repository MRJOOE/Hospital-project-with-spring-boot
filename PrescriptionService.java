package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.model.Prescription;
import com.hospital.repositories.PrescriptionRepository;
import com.hospital.serviceInterface.IPrescriptionService;

import java.util.List;

@Service
public class PrescriptionService implements IPrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

   @Override
    public String AddPrescription (Prescription prescription){
	   try {
		   prescriptionRepository.save(prescription);
		   return "Prescription is Added";
	   }
        catch (Exception e) {
        	 return "All Data Should Be Entered";
		}
    }	
    
   @Override
    public List <Prescription> getPrescriptionsByID(int did,int pid){
        return prescriptionRepository.getPrescriptionsByID(did,pid);
    }
       
   @Override
    public void DeletePrescription(int prescriptionId) {
    	prescriptionRepository.deleteById(prescriptionId);
    }
    
}