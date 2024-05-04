package com.hospital.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor extends Person {
	
	private int age;
	private String specialization;
	private String email;
	private String password;
	private int mobile;
	private String address;
	

    
	@ManyToMany (cascade=CascadeType.ALL)
	@JoinTable(name = "doctor_patient",
	joinColumns = @JoinColumn(name="DID"),
	inverseJoinColumns = @JoinColumn(name="PID"))
	private Set<Patient> assignedPatients = new HashSet<>();

	public Doctor() {
		super();
	}


	public Doctor(int id, String firstName, String lastName, int age, String specialization, String email,
			String password, int mobile, String address) {
		super(id, firstName, lastName);
		this.age = age;
		this.specialization = specialization;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
	}


	


	public Set<Patient> getAssignedPatient() {
		return assignedPatients;
	}


	public void setAssignedPatient(Set<Patient> assignedPatient) {
		assignedPatients = assignedPatient;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
}
