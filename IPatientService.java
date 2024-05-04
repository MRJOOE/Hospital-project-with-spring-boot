package com.hospital.serviceInterface;

import java.util.List;
import com.hospital.model.Patient;
import com.hospital.serviceInterface.IPatientService;

public interface IPatientService {
	
	public Patient getPatientById(int id);
	public String addPatient( Patient newPatient,int did);
	public boolean isNationalIDValid(Long nid) ;
	public  List<Patient> getAssignedPatients(int id);
	public String updatePatient(Patient newPatient);
	public void deletePatient(int did,int pid);
	
}