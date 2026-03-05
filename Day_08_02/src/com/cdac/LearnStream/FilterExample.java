package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
         public static void main(String[] args) {
			  
        	  List<Integer> list = Arrays.asList(3,1,2,6,3,9);
        	  
        	  List<Integer> List_even_num = list.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
        	  System.out.println(List_even_num);
		}
}
