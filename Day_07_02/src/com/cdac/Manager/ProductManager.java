package com.cdac.Manager;
import com.cdac.model.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
  
	ArrayList<Product> plist = new ArrayList<Product>();
	
//	 private int Product_Id;
//	 private int Price;
//	 private String colour;
//	 private String Category;
	
	public ProductManager(){
		 plist.add(new Product(1001,2000,"Black","Keyboard"));
		 plist.add(new Product(1002,3200,"White","Mouse"));
		 plist.add(new Product(1003,2300,"Black","CPU"));
		 plist.add(new Product(1003,2300,"White","Charger"));
		 plist.add(new Product(1003,2300,"Black","LED"));
		 plist.add(new Product(1003,2300,"White","Paper"));
		 
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
		  
			plist.stream().forEach(null);
				   
	}
	
	
	public void UpdateProduct() {
		  boolean flage = false;
		  
		  int id;
		  System.out.println("enter the id of product");
		  id = sc.nextInt();
		   for(Product p:plist ) {
			   
			   if(p.get == id ) {
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
		
		
	}
	
	public void SortByPrice() {
		
	}
	
	
	
}
