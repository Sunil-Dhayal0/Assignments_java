package com.cdac.model;

public class Product {

	 private int    Product_Id;
	 private String Product_Name;
	 private int    Product_Price;
	 private String Product_Colour;
	 private String Product_Category;
	 
	 public Product() {
		 
	 }
	 
	 

	 public Product(int product_Id, String product_Name, int product_Price, String product_Colour,
			String product_Category) {
		super();
		Product_Id = product_Id;
		Product_Name = product_Name;
		Product_Price = product_Price;
		Product_Colour = product_Colour;
		Product_Category = product_Category;
	}



	 public int getProduct_Id() {
		 return Product_Id;
	 }

	 public void setProduct_Id(int product_Id) {
		 Product_Id = product_Id;
	 }

	 public String getProduct_Name() {
		 return Product_Name;
	 }

	 public void setProduct_Name(String product_Name) {
		 Product_Name = product_Name;
	 }

	 public int getProduct_Price() {
		 return Product_Price;
	 }

	 public void setProduct_Price(int product_Price) {
		 Product_Price = product_Price;
	 }

	 public String getProduct_Colour() {
		 return Product_Colour;
	 }

	 public void setProduct_Colour(String product_Colour) {
		 Product_Colour = product_Colour;
	 }

	 public String getProduct_Category() {
		 return Product_Category;
	 }

	 public void setProduct_Category(String product_Category) {
		 Product_Category = product_Category;
	 }
	 
	
	 
	 
	
}
