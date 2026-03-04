package com.cdac.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnLists {
  
	  public static void main(String[] args) {
//		  
//		List<Integer> list = new ArrayList<>();
//		
//		List<Integer> list2 = new ArrayList<>();
//		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		System.out.println(list);
//		System.out.println(list.contains(20));
//		System.out.println(list);
//		list.add(60);
//		list.add(80);
//		list2.add(20);
//		list2.add(30);
//		list2.add(33);
//		list2.add(44);
//		System.out.println(list);
//		list.removeAll(list2);
//		System.out.println(list);
		
		
		List <String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grappes");
		fruits.add("mango");
		fruits.add("grapes");
		
		
		for(String fruit:fruits) {
			  System.out.println(fruit);
		}
		
		System.out.println("\n \n");
		  
		for(int i = 0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
 	   System.out.println("\n \n \n");

 	   Iterator<String> fe = fruits.iterator();
		
		while(fe.hasNext()) {
		 System.out.println(fe.next());
		}
	
	}
	
	   
	   
	 
}
