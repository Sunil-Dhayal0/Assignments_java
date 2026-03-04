package com.cdac.manager;

import java.util.ArrayList;
import com.cdac.model.Patients;
import java.util.*;

public class PatientManager {
	 
	ArrayList<Patients> plist;
	 
	 public PatientManager() {
		 
		   	 
		  plist = new ArrayList<Patients>();
		  
		  plist.add(new Patients(1001,"sahil","fever","A+",201,24,"Asthana"));
	 }
	 
	 
	 public void AddPatient() {
		  Scanner sc = new Scanner(System.in);
		  Patients p = new Patients(1001,"sahil","fever","A+",201,24,"Asthana");
		  System.out.println("enter the patient id \t");
		  p.setName(sc.next());
		  System.out.println("enter the name of  patient");
		  
	 }
	 
	 

}
