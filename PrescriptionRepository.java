package com.hospital.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.model.Prescription;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
	
	@Query("SELECT PR from Prescription PR WHERE PR.DoctorID=:did and PR.PatientID=:pid")
	List<Prescription> getPrescriptionsByID(@Param ("did") int did,@Param ("pid") int pid);
}
