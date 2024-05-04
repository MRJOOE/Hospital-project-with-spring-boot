package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.model.Patient;
import com.hospital.repositories.PatientRepository;
import com.hospital.serviceInterface.IPatientService;




@Service
public class PatientService implements IPatientService{
	
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	PatientSetService patientSetService;
	@Autowired
	PatientDataProcessor patientDataProcessor;

	
	
	@Override
	public Patient getPatientById(int id){
		return patientRepository.findById(id);
	}
	
	
	
	@Override
	public String addPatient( Patient newPatient,int did)
	{
		try {
			if(isNationalIDValid(newPatient.getNid())) {
				
				Patient patient=patientRepository.findByNid(newPatient.getNid());
				if(patient!=null) {
					updatePatient(patient);
					 patientSetService.AssignPatient(patient, did);
				}
				else {
					patientRepository.save(newPatient);
					patientSetService.AssignPatient(newPatient, did);
				}
				return "Added Succesffully";
			}
			else return "Make Sure The National ID is Correct";
				
			
		} catch (Exception e) {
			return "Make Sure The Data You Entered is Correct";
		}
		
			
				}
		
		
	
	@Override
	public boolean isNationalIDValid(Long nid) {
		if(Long.toString(nid).length()==14) {return true;}
		else {
			return false;
		}
	}
	

	

	@Override
	public  List<Patient> getAssignedPatients(int id){
		return patientRepository.getAssignPatients(id);
	}
	
	@Override
	public String updatePatient(Patient newPatient){
	
		 try {
				Patient patient=patientDataProcessor.AppendData(newPatient);
				 patientRepository.save(patient);
				 return "Updated Successfully";
			} catch (Exception e) {
				return "Make Sure The Data You Entered is Correct";
			}
	}
	
	@Override
	public void deletePatient(int did,int pid){
		patientSetService.RemovePatient(did,patientRepository.findById(pid));
	}
	

	
}