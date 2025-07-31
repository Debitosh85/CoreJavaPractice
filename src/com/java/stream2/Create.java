package com.java.stream2;
import java.util.stream.Stream;

public class Create{
	public static void main(String[] args) {
		
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		       .filter(n -> n%2==0)
		       .map(n-> n*n)
		       .forEach(System.out::println);
		    
	}
}

	


		
			
			
	