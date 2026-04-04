package com.java.multithreading;

	class  Table {
		public synchronized void printable(int num) {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.getMessage();
				}
			  System.out.println(num+"x"+i+"="+num*i);
			}
			String name = Thread.currentThread().getName();
			System.out.println(name+"thread is Completed");
		}
	}
	public class MethodLevelSynchronization {
		public static void main(String[] args) {
			Table obj = new Table();
			Thread t = new Thread(){
				@Override
				public void run() {
					obj.printable(5);
				}
			};
			
			Thread t1 = new Thread(){
				@Override
				public void run() {
					obj.printable(10);;
				}
			};
			t.start();
			t1.start();
		}
	}
