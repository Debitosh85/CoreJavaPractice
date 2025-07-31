package com.java.collection3;
import java.util.ArrayList;
import java.util.Collections;

public class Collection {
	public static void main(String[] args) {
		
         ArrayList<String> al =  new ArrayList<>();
         
         al.add("Jiban");
         al.add("Subham");
         al.add("Nakula");
         al.add("Badal");
         
         for(String name:al)
         {
        	 System.out.println(name);
         }
         	
        System.out.println("Names before sort"+al);
         Collections.sort(al);
        
        System.out.println("Names after sort:"+(al));
         
     
        
	}

}
