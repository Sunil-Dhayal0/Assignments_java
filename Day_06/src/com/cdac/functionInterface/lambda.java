package com.cdac.functionInterface;

public class lambda {
	  
	public static void main(String[] args) {
		
		
		//--------------------- functional -interface----------//
		  sample s1 = new sample() {
			  
			   public void interfacemethod() {
			    	   System.out.println("anonymous class's object called"); 
			    }
		  };
		  
		  // s1  and s2 is same way to write
		  
		 
		  
		  Walkable w1 = (int steps) ->{
			 
			  System.out.println("walked "+steps+" steps");
			  
			  return steps;
		  };
		  
		  w1.walks(4);
		  s1.interfacemethod();
		  
		  Walkable w2 = (int steps) -> 2*steps;
		  
		   System.out.println(w2.walks(10));
	
	//-------------------------------------------------------//
	
	
	}
	

}


@FunctionalInterface

interface sample{
	// abstract method
	void interfacemethod ();
	
}

interface Walkable{
	// abstract method
	 int walks(int steps);
}