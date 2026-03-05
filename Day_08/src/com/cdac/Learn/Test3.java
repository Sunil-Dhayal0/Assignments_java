package com.cdac.Learn;

import java.lang.reflect.Field;

class Class1{
	
	  private int num1;
	  private int num2;
	 
	  public Class1() {
		  
	  }
	  public Class1(int num1 , int num2) {
		  super();
		  this.num1 = num1;
		  this.num2 = num2;
		  
	  }
	  public int getNum1() {
		  return num1;
	  }
	  public void setNum1(int num1) {
		  this.num1 = num1;
	  }
	  public int getNum2() {
		  return num2;
	  }
	  public void setNum2(int num2) {
		  this.num2 = num2;
	  }
	  
	  
	  
}


public class Test3 {
     
	public static void main(String[] args) throws NoSuchFieldException,SecurityException, IllegalArgumentException, IllegalAccessException{
	
		Class1 t1 = new Class1();
		Class<?> c1 = null;
		
		try {
			  c1 = Class.forName("com.cdac.Learn.Class1");
		} catch( ClassNotFoundException e) {
			
			 e.printStackTrace();
		}
	 
		Field farr[] = c1.getDeclaredFields();
		
		for(Field f : farr) {
			  System.out.println(f+" is accessible"+f.isAccessible());
		}
		
		//t1.num1 =100;
		
		Field fNum1 = c1.getDeclaredField("num1");
		
		fNum1.setAccessible(true);
		fNum1.setInt(t1, 100);
		
		Field fNum2 = c1.getDeclaredField("num2");
		
		fNum2.setAccessible(true);
		fNum2.setInt(t1, 200);
		
		System.out.println(t1.getNum1());
		System.out.println(t1.getNum2());
		
	}
	
		
	
}





