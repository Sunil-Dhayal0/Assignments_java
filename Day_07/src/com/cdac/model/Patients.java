package com.cdac.model;


public class Patients {
           
 private   int Patient_Id;
 private   String Patient_Name;
 private   String Patient_Disease;
 private   String Patient_BloodGroup;
 private   int Patient_WardNo;
 private   int Patient_Age;
 private   String DoctorName;
 
 // Constructor
 
 public Patients(int patient_Id, String patient_Name, String patient_Disease, String patient_BloodGroup,
			int patient_WardNo, int patient_Age, String doctorName) {
		super();
		Patient_Id = patient_Id;
		Patient_Name = patient_Name;
		Patient_Disease = patient_Disease;
		Patient_BloodGroup = patient_BloodGroup;
		Patient_WardNo = patient_WardNo;
		Patient_Age = patient_Age;
		DoctorName = doctorName;
	}
 public Patients() {
	 
 }
 
 // getters and setters
 
 public int getPatient_Id() {
	return Patient_Id;
 }

 public void setPatient_Id(int patient_Id) {
	Patient_Id = patient_Id;
 }
 public String getPatient_Name() {
	return Patient_Name;
 }
 public void setPatient_Name(String patient_Name) {
	Patient_Name = patient_Name;
 }
 public String getPatient_Disease() {
	return Patient_Disease;
 }
 public void setPatient_Disease(String patient_Disease) {
	Patient_Disease = patient_Disease;
 }
 public String getPatient_BloodGroup() {
	return Patient_BloodGroup;
 }
 public void setPatient_BloodGroup(String patient_BloodGroup) {
	Patient_BloodGroup = patient_BloodGroup;
 }
 public int getPatient_WardNo() {
	return Patient_WardNo;
 }
 public void setPatient_WardNo(int patient_WardNo) {
	Patient_WardNo = patient_WardNo;
 }
 public int getPatient_Age() {
	return Patient_Age;
 }
 public void setPatient_Age(int patient_Age) {
	Patient_Age = patient_Age;
 }
 public String getDoctorName() {
	return DoctorName;
 }
 public void setDoctorName(String doctorName) {
	DoctorName = doctorName;
 }
 

  
 
}
