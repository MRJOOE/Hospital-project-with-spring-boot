package com.hospital.serviceInterface;

import java.util.List;
import com.hospital.model.Pending;

public interface IPendingService  {
	
	public List<Pending> getPendingDoctor();
	
	
	
	public void Decline(int id) ;
	
	public void Accept(int id) ;
	
}
