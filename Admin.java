package com.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends Person {
	
	private String email;
	private String password;
	
	public Admin() {
		super();
	}
	
	
	public Admin(int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName);
		this.email = email;
		this.password = password;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

}
