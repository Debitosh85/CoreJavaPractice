package com.java.multithreading;

class Stuff extends Thread{
	public void run() {
		
		Thread name = Thread.currentThread();
		System.out.println("Name of Current Thread is:"+name.getName());
	}
}

public class StuffMain {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		t1.start();
		System.out.println("Main Method Started!");
		
		Stuff s = new Stuff();
		Stuff s1 = new Stuff();
		
		s.start();
		s1.start();
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Number can't be devided by Zero:");
		}
		
		System.out.println("Main Method ended !");
	}

}
