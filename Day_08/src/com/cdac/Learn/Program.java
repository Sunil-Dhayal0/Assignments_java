package com.cdac.Learn;

import java.lang.reflect.Constructor;

class P_Test{
	
	
}

public class Program {
   public static void main(String[] args) throws ClassNotFoundException {
	   Class<?> c1 = null;
	   c1 = Class.forName("com.cdac.Learn.P_Test");
	   
	   Constructor<?> carr[] = c1.getDeclaredConstructor();
	   
	   for(Constructor<?> C:carr)
	   {
		    System.out.println(c1.getName());
	   }
	   
	   Constructor<?>[] con = c1.getDeclaredConstructors();
}
} 
