package com.java.multithreading;

class Alpha extends Thread{
	@Override 
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		Beta b = new Beta();
		b.setName("Beta thread");
		b.start();
		try {
			b.join();
		}catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i=1;i<=30;i++) {
			System.out.println("I value is"+i+"by"+name);
		}
	}
}
public class JoinDemo2 {
	
	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		a.setName("Alpha Thread");
		a.start();
	}
}
class Beta extends Thread{
	@Override 
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i=1;i<=5;i++) {
			System.out.println("I value is"+i+"by"+name);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"Thread is Dead...");
	}
}
