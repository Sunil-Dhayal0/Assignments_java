package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
          public static void main(String[] args) {
			
        	  List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        	  
        	   int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        	  
        	   System.out.println(sum);
        	  
		}
}
