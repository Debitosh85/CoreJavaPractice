package com.javastream3;

import java.util.stream.Stream;

public class OrderSquare {

	public static void main(String[] args) {
		
		Stream.iterate(1, n->n+2).limit(10).map(n->n*n).forEach(System.out::println);

	}

}
