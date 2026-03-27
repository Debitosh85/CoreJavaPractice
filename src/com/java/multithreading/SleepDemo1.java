package com.java.multithreading;

class Average extends Thread{
	
	
	@Override 
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println("Child thread is :"+Thread.currentThread().getId());
		
		for(int i=1;i<=5;i++) {
			System.out.println(name+"I Value is:"+i);
			try {
				
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				System.out.println(name+"Thread Interrupted"+e);
			}		
		}
		
	}
}
public class SleepDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread is running id is:"+Thread.currentThread().getId());
		
		Average a = new Average();
		Average b = new Average();
		
		a.start();
		b.start();
		
	}
}
