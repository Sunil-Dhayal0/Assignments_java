package com.cdac.model;

public class Product {

	 private int Product_Id;
	 private int Price;
	 private String colour;
	 private String Category;
	 
	 public Product() {
		 
	 }
	 
	 public Product(int product_Id, int price, String colour, String category) {
		super();
		Product_Id = product_Id;
		Price = price;
		this.colour = colour;
		Category = category;
	 }

	 public int getProduct_Id() {
		 return Product_Id;
	 }

	 public void setProduct_Id(int product_Id) {
		 Product_Id = product_Id;
	 }

	 public int getPrice() {
		 return Price;
	 }

	 public void setPrice(int price) {
		 Price = price;
	 }

	 public String getColour() {
		 return colour;
	 }

	 public void setColour(String colour) {
		 this.colour = colour;
	 }

	 public String getCategory() {
		 return Category;
	 }

	 public void setCategory(String category) {
		 Category = category;
	 }
	 
	 


	 
	 
	
}
