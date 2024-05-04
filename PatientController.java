package com.hospital.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.model.Patient;
import com.hospital.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/patient/{did}")
	public String addPatient(@RequestBody Patient newPatient,@PathVariable int did){
		return patientService.addPatient(newPatient,did);
		
	}
	
	@GetMapping("/patient/{id}")
	public Patient getPatientById(@PathVariable int id)
	{
		return patientService.getPatientById(id);
	}	
	
	@GetMapping("/my-patients/{id}")
	public List<Patient> getAssignedPatients(@PathVariable int id)
	{
		return patientService.getAssignedPatients(id);
	}
	
	@PutMapping("/patient")
	public String updatePatient(@RequestBody Patient newPatient)
	{
		return patientService.updatePatient(newPatient);
		
	}
	
	@DeleteMapping("/patient/{did}/{pid}")
	    public String deletePatient(@PathVariable int did,@PathVariable int pid)
	    {
	    	patientService.deletePatient(did,pid);
	    	return "Deleted Successfully";
	    }
}