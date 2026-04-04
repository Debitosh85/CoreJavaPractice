package com.java.multithreading;

public class PriorityDemo1 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println("Prority of the t1 thread:"+t1.getPriority());
		
	}
}

class UserThread extends Thread{
	
}

class PriorityDemoMain{
	public static void main(String[] args) {
		
		int priority = Thread.currentThread().getPriority();
		System.out.println("Priority of main Thread:"+priority);
		
		UserThread u = new UserThread();
		int userP= u.getPriority();
		System.out.println("User Thread Priority:"+userP);
		
	}
}
