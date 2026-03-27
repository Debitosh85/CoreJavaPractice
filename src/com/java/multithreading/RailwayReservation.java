package com.java.multithreading;

 class Customer implements Runnable{
	
	int availableSeat = 1;
	int wantedSeat;
	
	public Customer(int wantedSeat) {
		super();
		this.wantedSeat = wantedSeat;
	}
	
	@Override
	public void run() {
		
		if(availableSeat>=wantedSeat) {
			String name = Thread.currentThread().getName();
			System.out.println(wantedSeat+"berth is Reserved for"+ name);
			availableSeat = availableSeat - wantedSeat;
		}else {
			System.out.println(availableSeat+"is availableSeat");
			String name = Thread.currentThread().getName();
			System.err.println(name+" your Seat Requirement is more than Available");
		}
	}
}
 class Demo1{
	public static void main(String[] args) {
		System.out.println("hi..........");
	}
	
}
class RailwayReservation {
	public static void main(String[] args) {
		
		Customer c = new Customer(2);
		
		Thread t = new Thread(c,"Smith");
		Thread t1 = new Thread(c,"Scott");
		
		t.start();
		t1.start();
		
	}
	

}
