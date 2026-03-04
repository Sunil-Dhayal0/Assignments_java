package com.cdac.abstractLearn;

public class LearnInnerClass {
      
	class Toy{
		int price;
		
	}
	
	int oldPrice = 5500;
	
	static class NewToy{
		 int newPrice;
	}
	
    public static void main(String[] args) {
		  // Toy t1 = new Toy();  we can't create object non-static class object without create the object of outer class

            LearnInnerClass obj = new LearnInnerClass();
            
            Toy toy = obj.new Toy();
            toy.price = 2300;
            obj.oldPrice = 34200;   // we can access the outer class variable also like this 
            
            System.out.println(toy.price);
            
            NewToy newobj = new NewToy();     // we can create the object of static class without create the object of outer class
            newobj.newPrice = 231000;
//            newobj.oldPrice = 450000;       // we can't access the variable of outer class if  my class is static
//            System.out.println(newobj.oldPrice);
              System.out.println(newobj.newPrice);
    }	 
	
}
