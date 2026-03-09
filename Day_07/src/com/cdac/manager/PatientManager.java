package com.cdac.manager;

import java.util.ArrayList;
import com.cdac.model.Patients;
import java.util.*;

interface Patient_Operations{
	  void Add_Patient_Details();
}


public class PatientManager {
		
//	 private   int Patient_Id;
//	 private   String Patient_Name;
//	 private   String Patient_Disease;
//	 private   String Patient_BloodGroup;
//	 private   int Patient_WardNo;
//	 private   int Patient_Age;
//	 private   String DoctorName;
	 
	   ArrayList<Patients> plist = new ArrayList<>();
	     
	   PatientManager(){
		     plist.add(new Patients(101,"Ronak","Fever","O-", 11, 23,"Dr.Aman Kumar"));   
	   }
	   
	   public void 
	   

}
