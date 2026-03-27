package com.java.multithreading;

class Tatkal implements Runnable{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name+"booking Tatkal Ticket Under Tatkals scheme..");
	}
}

class PremiumTatkal implements Runnable {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"Booking Ticket under Premium Tatkal Scheme..");
	}
}
public class TicketCounter {
	public static void main(String[] args)throws InterruptedException {
		
		Thread t = new Thread(new Tatkal(),"Scott");
		t.start();
		Thread.sleep(1000);
		t.join();
		
		
		Thread t1 = new Thread(new PremiumTatkal(),"Smith");
		t1.start();
		
		Thread t2 = new Thread(new Tatkal(),"Allen");
		t2.start();	
		
		
	}
}

/*
public native static Thread CurrentThread()
public synchronized void start()
public static void sleep()
public final String setName()
public final String getName()
public final boolean isAlive()
public final void join()
 */

