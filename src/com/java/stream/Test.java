package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Integer [] numbers = {-10,-5,0,5,10,15,-20};
		
		List<Integer> li = Arrays.stream(numbers)
				           .filter(num-> num> 0)
				           .collect(Collectors.toList());
		System.out.println("Positive no's:+"+li);
				           
		
	    
		
		
		
		
	}

}
