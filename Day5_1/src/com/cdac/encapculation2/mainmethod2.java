package com.cdac.encapculation2;

import com.cdac.encapculation.Teacher;

public class mainmethod2 extends Teacher {
	
	     public static void main(String[] args) {
			   Teacher obj = new Teacher();
			    obj.teachingclass = 234;           // public  another package sub-class
			    //obj.degree = "B.sc";              // default  another package sub-class can't access
			    // obj.studentsCount = 50;             // protected another package sub-class can't access
			   // obj.salary                          // private 
		       mainmethod2 mainmethod_2 = new mainmethod2();
		       
		       mainmethod_2.studentsCount = 50;
		       
		       System.out.println(mainmethod_2.studentsCount);
		       
		       
		}

}
