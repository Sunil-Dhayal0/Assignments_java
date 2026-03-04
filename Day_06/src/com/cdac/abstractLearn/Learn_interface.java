package com.cdac.abstractLearn;


public class Learn_interface {
    public static void main(String[] args) {
		  monkey m1 = new monkey();
		  m1.eat();
		  m1.sings();
	}
}

interface pet{
	
	void sings();
}


interface animal{
	  
	   void eat();   // it is by default public and abstract
	   
	   default void walk() {                           // don't need to implement in further 
		    System.out.println("animal is walking");
	   }
	
}

class monkey implements animal, pet {
	
	   public void eat() {
		    System.out.println("monkey is eating");
	   }
	   public void sings() {
		   System.out.println("monkey is sings");
	   }
	
}