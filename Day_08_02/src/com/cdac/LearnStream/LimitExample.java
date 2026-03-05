package com.cdac.LearnStream;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
         public static void main(String[] args) {
			  List<Integer> list = Arrays.asList(2,3,4,1,3,4,3,6,7,5,8,9);
			  
			  list.stream().limit(5).forEach(e -> System.out.println(e));
			  
		}
}
