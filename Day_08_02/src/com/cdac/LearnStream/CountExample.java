package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;

public class CountExample {
     
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,1,2,4,2,3,4);
	  
		 long num = list.stream().filter(e -> e>3).count();
		 System.out.println(num);
	
		 
	}
}
