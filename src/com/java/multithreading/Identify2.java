package com.java.multithreading;

class Identi extends Thread{
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(" Running thread name is:"+name);
	}
}
public class Identify2 {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		t.setName("Parent");
		
		Thread t1 = new Thread();
		t1.setName("Grand C");
		t1.start();
		
		String names = t1.getName();
		System.out.println(names+"is running in middle ");
		
		Identi i = new Identi();
		Identi i2 = new Identi();
		
		i.setName("Child 1");
		i2.setName("Child 2");
		
		i.start();
		i2.start();
		
		String name = Thread.currentThread().getName();
		System.out.println(name+"Thread is running");
	}
}
