package com.hospital.model;




import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="patient")
public class Patient extends Person{
	
	 @Column(name = "NID")
	    private Long nid;
	  @Column(name = "Date_of_Birth")
	    private Date Date_of_Birth;
	    @Column(name = "Gender")
	    private String gender;
	    @Column(name = "Phone_no")
	    private int mobile;
	    @Column(name = "Address")
	    private String address;
	    @Column(name = "Date_of_Arrival")
	    private Date dateOfArrival;
	    @Column(name = "Cost")
	    private int cost;
	    @Column(name="Medical_History")
	    private String Medical_History;
	    @Column(name = "Mediacl_Disease")
	    private String Mediacl_Disease;
	    
	    @JsonIgnore
	    @ManyToMany(mappedBy = "assignedPatients")
	    private Set<Doctor> assignedDoctors = new HashSet<>();
	    
	    public Patient() {
			super();
		}
	

		public Patient(int id, String firstName, String lastName, Long nID, Date date_of_Birth, String gender,
				int mobile, String address, Date dateOfArrival, int cost, String medical_History,
				String mediacl_Disease, Set<Doctor> assignedDoctors) {
			super(id, firstName, lastName);
			nid = nID;
			Date_of_Birth = date_of_Birth;
			this.gender = gender;
			this.mobile = mobile;
			this.address = address;
			this.dateOfArrival = dateOfArrival;
			this.cost = cost;
			Medical_History = medical_History;
			Mediacl_Disease = mediacl_Disease;
			this.assignedDoctors = assignedDoctors;
		}

		


		
		public Long getNid() {
			return nid;
		}


		public void setNid(Long nid) {
			this.nid = nid;
		}


		public Date getDate_of_Birth() {
			return Date_of_Birth;
		}

		public void setDate_of_Birth(Date date_of_Birth) {
			Date_of_Birth = date_of_Birth;
		}


		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
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

		public Date getDateOfArrival() {
			return dateOfArrival;
		}

		public void setDateOfArrival(Date dateOfArrival) {
			this.dateOfArrival = dateOfArrival;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getMedical_History() {
			return Medical_History;
		}

		public void setMedical_History(String medical_History) {
			Medical_History = medical_History;
		}

		public String getMediacl_Disease() {
			return Mediacl_Disease;
		}

		public void setMediacl_Disease(String mediacl_Disease) {
			Mediacl_Disease = mediacl_Disease;
		}

		
		
	    
	    
}
