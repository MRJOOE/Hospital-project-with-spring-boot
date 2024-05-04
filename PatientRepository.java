package com.hospital.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	Patient findById(int id);
	
	
	Patient findByNid(Long nid);
	
	@Query ("select D.assignedPatients from Doctor D where D.id =:id")
	 List<Patient>  getAssignPatients(@Param ("id") int id);
	
	
	
}
