package com.hospital.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.model.Patient;
import com.hospital.repositories.DoctorRepository;
import com.hospital.serviceInterface.IPatientSetService;

@Service
public class PatientSetService implements IPatientSetService {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public Set<Patient> AddToPatientSet(Patient patient,int did){
		Set<Patient> patientSet = getDoctorPatients(did);
		patientSet.add(patient);
		return patientSet;
	}
	
	@Override
	public void AssignPatient(Patient patient,int did) {
		doctorRepository.findById(did).get().setAssignedPatient(AddToPatientSet(patient, did));
		Save(did);
	}
	
	
	@Override
	public Set<Patient> getDoctorPatients(int did){
		return doctorRepository.findById(did).get().getAssignedPatient();
	}
	@Override
	public void RemovePatient(int did,Patient removedParient) {
		doctorRepository.findById(did).get().setAssignedPatient(RemoveFromPatientSet( did,removedParient));
		Save(did);
	}
	@Override
	public Set<Patient> RemoveFromPatientSet(int did,Patient removedParient){
		Set<Patient> patientSet = getDoctorPatients(did);
		patientSet.remove(removedParient);
		return patientSet;
	}
	@Override
	public void Save(int did) {
		doctorRepository.save(doctorRepository.findById(did).get());
	}
}
