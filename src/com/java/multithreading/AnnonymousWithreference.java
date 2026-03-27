package com.java.multithreading;

/*public class AnnonymousWithreference {
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				
				String name = Thread.currentThread().getName();
				System.out.println(name+"Thread is running");
			}
		};
		
		t1.start();
		
		String name = Thread.currentThread().getName();
		System.out.println("Currently name thread is running"+name);
		
		
	}

}*/


public class AnnonymousWithreference{
	
	public static void main(String[] args) {
		new Thread() {
			
			@Override
			public void run() {
				
				String name = Thread.currentThread().getName();
				System.out.println(name+"Thread is running...");
			}
		}.start();
	}
	
}
