package com.java.multithreading;

class Print {
	public synchronized void printNumTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.getMessage();
			}
		}
		System.out.println(".........................................");
	}
}
public class PrintTable {
	public static void main(String[] args) {
		
		Print p1 = new Print();
		Print p2 = new Print();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {     //lock 1
				p1.printNumTable(2);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				                    //lock 1
				p1.printNumTable(3);
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				                     
				p2.printNumTable(8);  //lock 2
			}
		};
		Thread t4 = new Thread() {
			@Override
			public void run() {       //lock 2
				p2.printNumTable(9);
			}
		};
		t1.start();
		t2.start(); 
		t3.start(); 
		t4.start();
	}
}
