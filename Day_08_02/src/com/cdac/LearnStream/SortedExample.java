package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
         public static void main(String[] args) {
			  
        	 List<String> names = Arrays.asList("Ronak","Sunil","Shivam","Amit","Anil");
        	 
        	 List<String> SortedName = names.stream().sorted().collect(Collectors.toList());
        	 
        	 System.out.println(SortedName);
        	 
		}
}
