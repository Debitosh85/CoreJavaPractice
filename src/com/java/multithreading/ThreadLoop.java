package com.java.multithreading;

class Smaple extends Thread{
	
	@Override
	public void run() {
		

		String name = Thread.currentThread().getName();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("I value of "+i+"by"+name+"Thread");
		}
	}
}

public class ThreadLoop {
	
	public static void main(String[] args) {
		
		Smaple s = new Smaple();

		s.start();
		
		String s1 = Thread.currentThread().getName();
		
		for(int j=1;j<=10;j++) {
			System.out.println("J Value of the"+j+"by"+s1+"Thread");
		}
		
		int x =1;
		do {
			System.out.println("India by name:"+x);
			x++;
		}while(x<=10);
	}

}
