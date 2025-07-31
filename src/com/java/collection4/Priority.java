package com.java.collection4;
import  java.util.*;

public class Priority {
    public static void main(String[] args) {
        
    	PriorityQueue<Object> pq = new PriorityQueue<>();
        pq.add("Orange");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Guava");
		pq.add("Grapes");
		
		//pq.add(null); // Inavlid
		//pq.add(23);    //Invalid
		
		System.out.println(pq);
    }
}

	

/*
 *PriorityQueue <String>q = new PriorityQueue<>();
       
       q.add("Red");
       q.add("Green");
       q.add("Orange");
       q.add("White");
       q.add("Black");
        
        System.out.println("Elements of the PriorityQueue:");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
			*/
