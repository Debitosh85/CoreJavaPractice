package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		
		Integer [] numbers = {1,2,3,4,5,3,6,7,8,4};
		
		List <Integer> li = Arrays.stream(numbers)
				            .distinct()
				            .collect(Collectors.toList());
		
		System.out.println("Unique Numbers are:"+li);
		
		
	}

}
