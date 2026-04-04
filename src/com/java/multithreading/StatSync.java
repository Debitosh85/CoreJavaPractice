package com.java.multithreading;

class Stat {
	
	public static synchronized void printTable(int num) {
		   for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.getMessage();
			}
		}
		    String name = Thread.currentThread().getName();
			System.out.println(name+"Thread is dead Now"); 
	}
}
public class StatSync {
	
	public static void main(String[] args) {
		
		Stat s = new Stat();
		Stat s1 = new Stat();
		
		Thread t = new Thread() {
			
			@Override 
			public void run() {
				Stat.printTable(5);
			}
		};
		
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				Stat.printTable(10);
			}
		};
		
		Runnable r1 = ()-> Stat.printTable(15);
		Thread t2 = new Thread(r1);
		
		
		t.start();
		t1.start();
		t2.start();
	}
}
