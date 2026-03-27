package com.java.multithreading;

 class Sleeps extends Thread {
	 public void run() {
		 
		 for(int i=1;i<=10;i++) {
			 System.out.println("I value is :"+i);
			 
			try {
				Thread.sleep(1000); //Sleep is used for temporary waiting of a thread 
				
			}catch(InterruptedException e) {
				
				System.out.println("Running Thread is interrupted:"+e);
			}
		 }
		 
	 }
}
 
public class Sleep{
	
	public static void main(String[] args) {
		
		Sleeps s = new Sleeps();
		s.start();
	}
}
