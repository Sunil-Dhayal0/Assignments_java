package com.cdac.abstractLearn;

public class Learnabstract {
 
	public static void main(String[] args) {
//		  vehicle v1  = new vechicle();
		  
		   car c1 = new car();
		   c1.accelerate();
		   
		  
	}
	
}

abstract class vehicle{
	    abstract void accelerate();
	    abstract int brakes(int wheels);                      // abstract method
	    void honks() { 
	    	System.out.println("vechicle honks");             // regular method not need use in child/sub-class  
	    }
}

class car extends vehicle{

	@Override
	void accelerate() {
		  System.out.println("acceleration is "+23);
		
	}

	@Override
	int brakes(int wheels) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	
	    
}
