package com.cdac.encapculation;


public class Teacher {
  	   
	 public int teachingclass;      // public
	        String degree;           //default 
	 protected int studentsCount;   // protected
	 private   int salary ;         // private
	 
	public static void main(String[] args) {
		
		 Teacher obj = new Teacher();
		 obj.teachingclass = 12;
		 obj.salary = 13;
		 obj.studentsCount = 50;
		 obj.degree  = "b.tech";
		 System.out.println(obj.teachingclass);
	     System.out.println(obj.salary);
	     System.out.println(obj.studentsCount);
	     System.out.println(obj.degree);
	} 
	
	
	 
}
