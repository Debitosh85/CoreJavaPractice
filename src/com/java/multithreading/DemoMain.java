package com.java.multithreading;

 class Demo extends Thread{
	
	public void run() {
		System.out.println("Child thread running in separate stack:");
	}

}

class DemoMain{
	public static void main(String[] args) {
		
		/*Thread t1 = new Thread();
		System.out.println("Is main thread alive:"+t1.isAlive());
		t1.start();
		System.out.println("Is main Thread Running:"+t1.isAlive());
		*/
		
		Demo d = new Demo();
		System.out.println("Is Thread-0 alive:"+d.isAlive());
		d.start();
		System.out.println("Is Thread-0 alive:"+d.isAlive());
		
		try {
			d.start();
		}catch(IllegalThreadStateException e) {
			System.out.println("In Java a thread can't start again other wise it will gave Exception!");
		}

	}
}


