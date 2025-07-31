package com.javastream3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted1  {

	public static void main(String[] args) {
		  
		        List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi", "orange", "grape", "plum");
		        List<String> sortedStrings = strings.stream()
		                                            .sorted((s1, s2) -> {
		                                                int lengthComparison = Integer.compare(s1.length(), s2.length());
		                                                if (lengthComparison != 0) {
		                                                    return lengthComparison;
		                                                } else {
		                                                    return s1.compareTo(s2);
		                                                }
		                                            })
		                                            .collect(Collectors.toList());

		        // Printing the sorted strings
		        System.out.println("Sorted Strings: " + sortedStrings);
		    }
		}


