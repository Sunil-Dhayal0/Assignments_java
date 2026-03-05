package com.cdac.Manager;
import com.cdac.model.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
  
	ArrayList<Product> plist = new ArrayList<Product>();
	
	
//	 private int    Product_Id;
//	 private String Product_Name;
//	 private int    Product_Price;
//	 private String Product_Colour;
//	 private String Product_Category;
	
	public ProductManager(){
		 plist.add(new Product(101,"Laptop",52000,"Black","Electronics"));
		 plist.add(new Product(102,"Shirt",2200,"Red","cloths"));
		 plist.add(new Product(103,"Keyboard",1300,"black","electronics"));
		 
//		 plist.add(new Product(1003,2300,"White","Charger"));
//		 plist.add(new Product(1003,2300,"Black","LED"));
//		 plist.add(new Product(1003,2300,"White","Paper"));
		 
	}
	
	Scanner sc =  new Scanner(System.in);
	
	public void AddProduct() {
		  
		Product p = new Product();
		
		System.out.println("enter the product id\t");
		p.setProduct_Id(sc.nextInt());
		System.out.println("enter the product price");
		p.setPrice(sc.nextInt());
		System.out.println("enter the product colour");
		p.setCategory(sc.next());
		System.out.println("enter the product category");
		p.setCategory(sc.next());

	     plist.add(p);
	}
	
	
	public void ViewProduct() {
		
		 
		
		plist.stream().forEach(p->System.out.println(p));
		
	}
	
	public void DeleteProduct() {
		  

				   
	}
	
	
	public void UpdateProduct() {
		  boolean flage = false;
		  
		  int id;
		  System.out.println("enter the id of product");
		  id = sc.nextInt();
		   for(Product p:plist ) {
			   
			   if(plist.get== id ) {
				    flage = true;
				  System.out.println("enter product price \t");  
				    p.Price =  sc.nextInt();
				   System.out.println("enter product colour \t"); 
				    p.colour = sc.next();
				   System.out.println("enter product Category"); 
				    p.Category =  sc.next();
				    
			   }
		   }
	}
	
	public void SortByName() {
		  
		 plist.stream().sorted(p.Category)
		
	}
	
	public void SortByPrice() {
		
	}
	
	
	
}
