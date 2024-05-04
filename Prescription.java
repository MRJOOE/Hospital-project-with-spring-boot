package com.hospital.model;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name="prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="DID")
    private int DoctorID;
    @Column(name="PID")
    private int PatientID;
    @Column(name="Medicine_Name")
    private String MedicineName;
    @Column(name="Doses")
    private String Doses;
    @Column(name="Date")
    private Date date;
    
    
    
	public Prescription() {
		super();
	}
	
	
	public Prescription(int id, int doctorID, int patientID, String medicineName, String doses, Date date) {
		super();
		this.id = id;
		DoctorID = doctorID;
		PatientID = patientID;
		MedicineName = medicineName;
		Doses = doses;
		this.date = date;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public int getPatientID() {
		return PatientID;
	}
	public void setPatientID(int patientID) {
		PatientID = patientID;
	}
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public String getDoses() {
		return Doses;
	}
	public void setDoses(String doses) {
		Doses = doses;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    
    
}