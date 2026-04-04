package com.java.multithreading;
class Foo extends Thread{
	
}
public class PriorityDemo3 {
	public static void main(String[] args) {
		
		/*Thread t = new Thread();
		t.setPriority(Thread.MAX_PRIORITY);*/
		
		Thread t1 = Thread.currentThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		
		Foo f = new Foo();
		System.out.println("Priority of a thread:"+f.getPriority());
		
	}

}
