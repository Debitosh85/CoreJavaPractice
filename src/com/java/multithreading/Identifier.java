package com.java.multithreading;


class Identify extends Thread{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println("Currently"+name+"running");
	}
	
}
public class Identifier {
	
	public static void main(String[] args) {
		
		Identify i = new Identify();
		Identify i2 = new Identify();
		
		i.start();
		i2.start();
		
		String name = Thread.currentThread().getName();
		System.out.println("Currently"+name+" is running");
	}
}
