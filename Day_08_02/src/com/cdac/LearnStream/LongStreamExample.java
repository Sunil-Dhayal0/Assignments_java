package com.cdac.LearnStream;

import java.util.stream.LongStream;

public class LongStreamExample {
	
	public static void main(String[] args) {
		
		  boolean anyGreaterThan5 = LongStream.range(0, 10).anyMatch(e -> e>5);
		  System.out.println(anyGreaterThan5);
		  
		  long count_even = LongStream.range(0, 20).filter(n -> n%2 ==0).count();
		  System.out.println(count_even);
	}

}
