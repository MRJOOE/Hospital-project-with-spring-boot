package com.hospital.serviceInterface;


import com.hospital.model.Prescription;
import java.util.List;


public interface IPrescriptionService {

    

   
	 public String AddPrescription (Prescription prescription);
    
   
    public List <Prescription> getPrescriptionsByID(int did,int pid);
    

    
   
    public void DeletePrescription(int prescriptionId) ;
    
}