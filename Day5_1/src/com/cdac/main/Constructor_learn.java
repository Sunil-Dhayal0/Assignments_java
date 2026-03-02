package com.cdac.main;

public class Constructor_learn {
         public static void main(String[] args) {
		     Complex num1 = new Complex(2,3);
		     Complex num2 = new Complex(4,7);
		     num1.print();
		     num2.print();
		     Complex result =  num2.add(num1);
		     result.print();
		}
}


class Complex{
	 
	  int a,b;
	  
	  
	  public Complex(int real , int img) {
		    this.a  = real;
		    this.b  = img;
	  }
	  void print() {
		  System.out.println(a+" + "+b+"i");
	  }
	  Complex add(Complex num2) {
		    
		  this.print(); // it is calling the method of current object that is num1 object
		  
		    return new Complex(a+ num2.a,b +num2.b);
	  }
	
}