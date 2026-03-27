package com.java.multithreading;

public class CheckMain {
	
	public static void main(String[] args) {
		
		/*Thread t = Thread.currentThread();
		System.out.println("name of the thread:"+t.getName());
		*/
		
		String t = Thread.currentThread().getName();
		System.out.println("Name of the Thread is:"+t);
		
		
	}

}
