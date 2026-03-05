package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {

	 public static void main(String[] args) {
		   List<Integer> list = Arrays.asList(1,2,3,2,1,4,4,2,6,7,8);
		   
		   List<Integer> list_new   = list.stream().distinct().collect(Collectors.toList());
		   
		     System.out.println(list_new);
	}
	   
} 
