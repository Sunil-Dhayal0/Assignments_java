package com.cdac.Learn;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Test {
     public static void main(String[] args) {
		  
           List<String> slist = new ArrayList<>();
           
           slist.add("sunil");
           slist.add("amit");
           slist.add("anil");
           slist.add("aman");
           
         List<Integer> length =   slist.stream().map(s -> s.length()).collect(Collectors.toList());
           
         System.out.println(length);
         
         IntStream is1 = IntStream.range(1, 10);
         
         IntStream is2 = IntStream.range(30, 40);
         
         IntStream is3 = is1.flatMap(is2.forEach(n -> n));
         
   	          
	}
}
