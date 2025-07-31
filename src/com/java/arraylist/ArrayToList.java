package com.java.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static List<String> convertToList(String[] inputArray) {
		
		List<String>list = Arrays.asList(inputArray);
		
		int arrLength = inputArray.length;
		int lLength = list.size();
		
		if(arrLength == lLength) {
			return list;
		}
		
		return null;
	}
	

}
