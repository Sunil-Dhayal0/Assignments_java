package com.main;

import java.util.Scanner;

public class Exception_03 {
         
	public static void main(String[] args)  {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the age :");
		  int age = sc.nextInt();
	
		  sc.close();
		  
	try {	  
		  if(age > 100) {
			  throw new MyException("my error is this");
		  }
	}catch(Exception e) {
		  System.out.println(e);
	}
	
   
	}
	 
	
}


class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
	
	
}

