package com.hospital.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

	List<Doctor> findByEmail(String email);
	List<Doctor> findByPassword(String password);
	
}
