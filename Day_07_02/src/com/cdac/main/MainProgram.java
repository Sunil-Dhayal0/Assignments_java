package com.cdac.main;

import java.util.Scanner;
import com.cdac.Manager.ProductManager;
public class MainProgram {
     
	public static void main(String[] args) {
		 
		ProductManager PM = new ProductManager(); 
		
		   int choice = 0;
		   Scanner sc = new Scanner(System.in); 
		   
		  do {
			 
			  System.out.println("===============Product management system ======================");
			  System.out.println("Enter 1 for add    product details \t");
			  System.out.println("Enter 2 for view   product details \t");
			  System.out.println("Enter 3 for Delete product details \t");
              System.out.println("Enter 4 for Update product details \t");			  
			  System.out.println("Enter 5 for SortByname product details \t");
			  System.out.println("Enter 6 for SortByPrice product details \t");
			  System.out.println("Enter 7 for exit ");
			    
		  }while(choice != 7)
		  
	     switch(choice) {
	        
	     case 1:
	    	   PM.AddProduct();
	     case 2:
	    	   PM.ViewProduct();
	     case 3:
	    	  PM.DeleteProduct();
	     case 4:
	    	 PM.UpdateProduct();
	     case 5:
	    	 PM.SortByName();
	     case 6:
	    	 PM.SortByPrice();
	     default:
	    	 System.out.println("you entered out of range number");
	     
	     }
		  
	}
	
}
