package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		String [] words = {"Raj" ,"Rohit","Smriti","Richa","Sky"};
		
		List <String> li =  Arrays.stream(words)
				           .filter(name-> name.length()>3)
				           .collect(Collectors.toList());
		
		System.out.println("Names are:"+li);
	}

}
