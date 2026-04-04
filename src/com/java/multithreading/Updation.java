package com.java.multithreading;

class Update implements Runnable{
	
	int x = 1;
	
	@Override
	public synchronized void run() {
		x++;
		System.out.println(x);
	}
}
public class Updation {
	
	public static void main(String[] args) {
		
		Update u = new Update();
		Thread t = new Thread (u,"Child1");
		Thread t1 = new Thread(u,"Child2");
		
		t.start();
		t1.start();
		
	}

}
