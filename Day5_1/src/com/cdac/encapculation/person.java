package com.cdac.encapculation;

public class person {
	
         private int age;
         private String name;
         public static int count;
         
         public void setAge(int age , String name) {
        	 
        	   this.age = age;
        	   this.name = name;
        	   
         }
         
         public void getAge() {
        	   
        	  System.out.println("age of person is"+age);
         }

}
