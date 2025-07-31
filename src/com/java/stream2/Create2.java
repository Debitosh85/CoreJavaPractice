package com.java.stream2;

import java.util.stream.Stream;

public class Create2 {

	public static void main(String[] args) {
		
		
		
		Stream.of("Hello","","world","","from","","java","!")
		         .filter(n->!n.isEmpty())  
		         .forEach(n->System.out.print(n+""));
		         
		        
		
		

	}

}
