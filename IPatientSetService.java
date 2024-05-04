package com.hospital.serviceInterface;

import java.util.Set;
import com.hospital.model.Patient;

public interface IPatientSetService  {

	
	
	public Set<Patient> AddToPatientSet(Patient patient,int did);
	
	
	public void AssignPatient(Patient patient,int did) ;
	
	
	public Set<Patient> getDoctorPatients(int did);
	
	public void RemovePatient(int did,Patient removedParient) ;
	public Set<Patient> RemoveFromPatientSet(int did,Patient removedParient);
	
	public void Save(int did) ;
}
