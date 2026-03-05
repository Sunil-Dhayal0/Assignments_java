package com.cdac.LearnStream;

import java.util.stream.IntStream;

public class IntStreamExample {
        public static void main(String[] args) {
			IntStream is = IntStream.rangeClosed(1, 10);
			
			System.out.println(" even number from 1 to 10");
			
			is.filter(e -> e%2 ==0).forEach(e -> System.out.println(e));
			
			System.out.println("Square number from 1 to 10");
			
			IntStream is1 = IntStream.range(1, 20);
			
			  is1.map(e -> e*e).forEach(e -> System.out.println(e));
			
			 System.out.println("sum number from 1 to 10");
			 
			 int sum = IntStream.range(0, 10).reduce(0, (a,b) -> a+b);
			     System.out.println(sum);
			     
			     
			
		}
}
