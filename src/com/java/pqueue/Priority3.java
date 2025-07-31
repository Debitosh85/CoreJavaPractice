package com.java.pqueue;

import java.util.*;
public class Priority3 {

	public static void main(String[] args) {
		
		
		PriorityQueue<String> q1 = new PriorityQueue<>();
		PriorityQueue<String> q2 = new PriorityQueue<>();
		
		q1.add("Red");
		q1.add("Green");
		q1.add("Black");
		q1.add("White");
		
	System.out.println("colors:"+q1);
	
	q2.add("Red");
	q2.add("Pink");
	q2.add("Black");
	q2.add("White");
	
	System.out.println(q2);
	
	for(String q:q1)
	if(q2.contains(q)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
		
		
		
		
		

	}

}
