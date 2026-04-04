package com.java.multithreading;

class Priority extends Thread{
	@Override
	public void run() {
		
		int count =0;
		
		for(int i=1;i<=1000000;i++) {
			count++;
		}
		
		int p = Thread.currentThread().getPriority();
		String name = Thread.currentThread().getName();
		
		System.out.println("Current Threads Prority is:"+p+"Name is:"+name);
	}
	
}
public class PriorityDemo4 {
	public static void main(String[] args) {
		
		Priority p1 = new Priority();
		Priority  p2 = new Priority();
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		
		p1.setName("Child1");
		p2.setName("Child2");
		
		p1.start();
		p2.start();
		
	}
}
