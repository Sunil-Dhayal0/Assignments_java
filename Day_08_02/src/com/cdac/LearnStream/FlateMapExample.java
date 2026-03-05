package com.cdac.LearnStream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlateMapExample {
    
	   public static void main(String[] args) {
		List<List<String>> ListOfLists = Arrays.asList(
				
			           Arrays.asList("hello","word"),
			           Arrays.asList("sunil","dhayal"),
			           Arrays.asList("amit","kumar")
				
				
				);
		
		//List <String> lists = Arrays.asList("hello","word","sunil","dhayal");
		
		 List<String> flateList = ListOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		 
		 System.out.println(flateList);
		
	}
}
