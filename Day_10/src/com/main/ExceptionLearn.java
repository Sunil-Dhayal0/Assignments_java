package com.main;

public class ExceptionLearn {
           public static void main(String[] args) {
			  int a[] = new int[5];
			  System.out.println("hello ");
		     
			  
			//1.
			  try {
				  //int b = 5 /0;
		     System.out.println(a[8]);
		     // System.out.println(b);
			  }catch(ArrayIndexOutOfBoundsException e){
				      System.out.println(e.getClass());  
			  }
//			  catch( ArithmeticException e) {
//				    System.out.println(e.getClass());
//			  }
			  
			  //2.
			  
			  
			  
			  
		}
}
