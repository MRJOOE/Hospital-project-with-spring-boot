package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Patient;
import com.hospital.repositories.PatientRepository;
import com.hospital.serviceInterface.IPatientDataProcessor;

@Service
public class PatientDataProcessor implements IPatientDataProcessor {
	
	@Autowired
	PatientRepository patientRepository;
	
	
	
	
	
	public Patient AppendData(Patient newPatientData) {
		Patient oldPatientData=patientRepository.findByNid(newPatientData.getNid());
		newPatientData.setMediacl_Disease(oldPatientData.getMediacl_Disease()+"\n"+newPatientData.getMediacl_Disease());
		newPatientData.setMedical_History(oldPatientData.getMedical_History()+"\n"+newPatientData.getMedical_History());
		newPatientData.setId(oldPatientData.getId());
		return newPatientData;
	}
}
