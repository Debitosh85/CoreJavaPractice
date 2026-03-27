package com.java.multithreading;

class ThreadName{
	
	public void printName() {
		
	String name =Thread.currentThread().getName();
	
	System.out.println("Running Thread name is:"+name);
	
	synchronized(this) {
		System.out.println(name+"Thread running inside synchronized block...");
		for(int i=1;i<=10;i++) {
			System.out.println(name+"have i value::"+i);
		}
		System.out.println(name+"Thread Finish its task inside synchronized block..");
	}
	}
}
public class BlockLevelSynchronization {
	
	public static void main(String[] args) {
		
		ThreadName t = new ThreadName();
		Runnable r1 = ()->t.printName();
		Runnable r2 = ()->t.printName();
		
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r2,"Child2");

		t1.start();
		t2.start();
		
		
		
	}

}
