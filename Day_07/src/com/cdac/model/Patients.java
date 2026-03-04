package com.cdac.model;

public class Patients {
           
 private	int patient_id;
 private	String name;
 private	String Disease;
 private   String BloodGroup;
 private   int WardNo;
 private   int Age;
 private   String DoctorName;
 
 
 public int getPatient_id() {
	return patient_id;
 }
 public void setPatient_id(int patient_id) {
	this.patient_id = patient_id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getDisease() {
	return Disease;
 }
 public void setDisease(String disease) {
	Disease = disease;
 }
 public String getBloodGroup() {
	return BloodGroup;
 }
 public void setBloodGroup(String bloodGroup) {
	BloodGroup = bloodGroup;
 }
 public int getWardNo() {
	return WardNo;
 }
 public void setWardNo(int wardNo) {
	WardNo = wardNo;
 }
 public int getAge() {
	return Age;
 }
 public void setAge(int age) {
	Age = age;
 }
 public String getDoctorName() {
	return DoctorName;
 }
 public void setDoctorName(String doctorName) {
	DoctorName = doctorName;
 }
 
 
 public Patients(int patient_id, String name, String disease, String bloodGroup, int wardNo, int age,
		String doctorName) {
	super();
	this.patient_id = patient_id;
	this.name = name;
	Disease = disease;
	BloodGroup = bloodGroup;
	WardNo = wardNo;
	Age = age;
	DoctorName = doctorName;
 }
    
 
     
 
}
