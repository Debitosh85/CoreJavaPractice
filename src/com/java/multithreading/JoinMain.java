package com.java.multithreading;

/*class Joins extends Thread{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
			for(int i=1;i<=5;i++) {
				System.out.println("I value is"+i+"by"+name);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(name+"Thread is dead");
		}
	}
public class JoinMain {
	public static void main(String[] args) {
		
		Joins j = new Joins();
		Joins j1 = new Joins();
		Joins j2 = new Joins();
		
		j.setName("J");
		j1.setName("J1");
		j2.setName("J2");
		
		j.start();
		try {
			j.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread wake up.");
		j1.start();
		j2.start();
		System.out.println("Main Thread is Dead...");
	}
}*/

/*
 Start() -> new Thread Registered -> OS gave new stack + thread control block 
 then OS scheduler will decide which thread to execute & JVM internally invoke run() Method
 
 Every thread has allocated with few time slice from OS . once 
 the time complete then CPU will save the context of running thread 
 switch to another thread .its happen due to context Switching 
*/



class Joins extends Thread{
@Override
public void run() {
  String name = Thread.currentThread().getName();
  for (int i = 1; i <= 10; i++) {
    System.out.println("I Value is " + i);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }
  System.out.println(name+"Thread is dead now");
}
}
public class JoinMain {
  public static void main(String[] args) {

    System.out.println("Main Thread Started..");
    String name = Thread.currentThread().getName();
    Joins j1 = new Joins();
    Joins j2 = new Joins();
    Joins j3 = new Joins();

    j1.setName("j1");
    j2.setName("j2");
    j3.setName("j3");

    j1.start();
    try {
      j1.join();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
    j2.start();
    j3.start();
    System.out.println("Main Thread Wake up");
    for (int i = 1; i <= 10; i++) {
      System.out.println("I value for i is:" + i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println(name+"Thread is dead now");
  }
}


