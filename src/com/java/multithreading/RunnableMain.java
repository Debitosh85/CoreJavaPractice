package com.java.multithreading;

import java.util.Scanner;

public class RunnableMain {
	
	public static void main(String[] args) {
		//Annonymous inner class using Runnable interface
		Runnable r = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name+"Thread is running..");
			}
		};
		
		Runnable r1 =()->{
			String name = Thread.currentThread().getName();
			System.out.println(name+"Thread is running");	
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				Scanner sc = new Scanner(System.in);
				try(sc) {
					System.out.println(name+"performing one job");
					System.out.println("Enter the number to find factorial?..");
					int num = sc.nextInt();
					int fact=1;
					for(int i=1;i<=num;i++) {
					fact= fact * i;
					}
					System.out.println("Factorial of the"+num+"is::"+fact);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		};
		
		Thread t3 = new Thread(new Runnable()
		{
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name+"is running...");
			}
		});
		
		new Thread(new Runnable()
		{
			@Override
			public void run() {
				System.out.println("Hello");
			}
			
		}).start();
		
		new Thread(()->System.out.println(Thread.currentThread().getName())).start();
		new Thread(()->System.out.println(Thread.currentThread().getName()),"Super").start();
		
		t3.setName("Runnable Thread..");
		t3.start();	
				
		Thread t = new Thread(r);
		t.setName("Deb");
		t.start();
		
		Thread t1 = new Thread(r1,"Child1");
		t1.start();
		
		t2.setName("Fact Thread..");
		t2.start();
	}
}
