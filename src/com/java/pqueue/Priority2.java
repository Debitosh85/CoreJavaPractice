package com.java.pqueue;


import java.util.*;
@SuppressWarnings("rawtypes")
public class Priority2 implements Comparable {

	public static void main(String[] args) {
		
		
		PriorityQueue<String > queue1 = new PriorityQueue<>();
		PriorityQueue<String>  queue2 = new PriorityQueue<>();
		
		
		queue1 .add("Red");
		queue1.add("Green");
		queue1.add("Orange");
		
		System.out.println("Colours are:"+queue1 );
		
		 queue2.add("Pink");
		 queue2.add("White");
		 queue2.add("Black");
		 
		 System.out.println("Colours  are :"+ queue2);
		 
		 queue1.addAll(queue2);
		 
		 System.out.println("Total Colors are:"+queue1);

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
