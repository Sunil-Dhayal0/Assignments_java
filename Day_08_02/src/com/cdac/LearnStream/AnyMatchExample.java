package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
     public static void main(String[] args) {
		  List<Integer> list =  Arrays.asList(2,3,1,4,5,6,7,8,3);
		  
		  boolean anyGreater5 = list.stream().anyMatch(n -> n>5);
		  
		  System.out.println(anyGreater5);
		  
	}
}
