package com.java.multithreading;

class ChildThread extends Thread{
	
	public void run() {
		System.out.println("Child Thread is running");
	}
}

public class NewThreadMain {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread Started!");
		
		ChildThread c = new ChildThread();
		c.start();
		System.out.println("Name of the Thread:"+c.getName());
		
		System.out.println("Main method ended");
		
	}

}
