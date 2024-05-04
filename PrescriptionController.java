package com.hospital.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hospital.model.Prescription;
import com.hospital.service.PrescriptionService;

@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;
    
    @GetMapping("/prescription/{did}/{pid}")
    public List<Prescription> getAllPrescriptions(@PathVariable int did,@PathVariable int pid) {
        return prescriptionService.getPrescriptionsByID(did,pid);
    }
    
    @PostMapping("/prescription")
    public String  AddPrescription(@RequestBody Prescription prescription) {
    	return prescriptionService.AddPrescription(prescription);
    }

  
    
    
    @DeleteMapping("/prescription/{id}")
    public String DeletePrescription(@PathVariable("id") int prescriptionId) {
        prescriptionService.DeletePrescription(prescriptionId);
        return  "Deleted Successfully ";
    }
}