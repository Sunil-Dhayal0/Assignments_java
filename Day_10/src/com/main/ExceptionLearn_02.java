package com.main;


public class ExceptionLearn_02 {
	

	  public static void main(String[] args) {
		  
		  // throws and throw
		  int arr[] = new int[5];
		  
		  try {
	        getelementofArray(arr);              
		  }catch(Exception e) {
			    System.out.println("exception catched"+e.getMessage());
		  }
	        
		  
	}
	  
	     static int getelementofArray(int arr[]) throws ArrayIndexOutOfBoundsException{	 
			   return arr[8];
		 }
}
