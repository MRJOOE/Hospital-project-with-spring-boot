package com.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.model.Pending;
import jakarta.transaction.Transactional;


@Repository
public interface PendingRepository extends JpaRepository<Pending, Integer>{
	
	

	@Transactional
	@Modifying
	@Query("INSERT INTO Doctor D(D.firstName,D.lastName,D.age,D.email,D.password,D.specialization,D.mobile,D.address) SELECT P.firstName,P.lastName,P.age,P.email,P.password,P.specialization,P.mobile,P.address from Pending P WHERE P.id=:id")  
	int Accept(@Param ("id") int id);
	
	
	
}
