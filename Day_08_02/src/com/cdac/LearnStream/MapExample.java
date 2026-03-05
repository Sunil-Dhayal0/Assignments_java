package com.cdac.LearnStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	  public static void main(String[] args) {
		  List<String>words = new ArrayList<>();
		  
		  words.add("hello");
		  words.add("java");
		  words.add("Stream");
		  
		 // List<Integer> lengths = words.stream().map(e -> e.length()).collect(Collectors.toList());
		    List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());  // both are same
		  
		    
		    
		  
		  System.out.println(lengths);
		  
	}
	
}
