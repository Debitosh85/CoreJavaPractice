package com.app.ticketbooking;

public class TicketBookingMain {
	
	    public static void main(String[] args) {
	        Show movieA = new Show(1, "Movie A", 3);
	        Show movieB = new Show(2, "Movie B", 2);
	        Show movieC = new Show(3, "Movie C", 1);

	        TicketBookingSystem bookingSystem = new TicketBookingSystem();

	        User alice = new User("Alice", movieA, bookingSystem);
	        User bob = new User("Bob", movieB, bookingSystem);
	        User charlie = new User("Charlie", movieA, bookingSystem);
	        User diana = new User("Diana", movieC, bookingSystem);
	        User eve = new User("Eve", movieB, bookingSystem);

	        Thread t1 = new Thread(alice);
	        Thread t2 = new Thread(bob);
	        Thread t3 = new Thread(charlie);
	        Thread t4 = new Thread(diana);
	        Thread t5 = new Thread(eve);

	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();
	        t5.start();

	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	            t5.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("All booking attempts finished.");
	    }
	}



