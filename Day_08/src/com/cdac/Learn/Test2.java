package com.cdac.Learn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {

//	public static void main(String[] args) {
//		Integer a1 = 100;
//		System.out.println(a1.getClass().getPackage());
//		
//		Method arr[] = a1.getClass().getMethods();
//		
//		System.out.println(arr);
//	}
	 
	
	
	class Student{
		 
		 int Rollno;
		 
		 public Student(){
			 
		 }
		 public Student(int Rollno) {
			 this.Rollno = Rollno;
		 }
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Integer a1 = 200; 
	Class<?> c1 = a1.getClass().getSuperclass();
	System.out.println(c1.getName());
	
	Constructor<?> cons[] =  c1.getClass().getConstructors();
	
	for(Constructor<?> c: cons) {
		  System.out.println(c.getModifiers());
		
	}

	    

	}
	 


}
