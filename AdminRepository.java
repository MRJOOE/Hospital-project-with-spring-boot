package com.hospital.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hospital.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	 List<Admin> findByEmail(String email);
	List<Admin> findByPassword(String password);	

}
