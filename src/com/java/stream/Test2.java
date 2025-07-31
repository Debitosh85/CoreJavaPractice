package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Test2 {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};

        
        List<String> namesContainingA = Arrays.stream(names)
                                              .filter(name -> name.toLowerCase().contains("a"))
                                              .collect(Collectors.toList());

       
        System.out.println("Names Containing 'A' or 'a': " + namesContainingA);
    }
}
