package com.app.ticketbooking;

public class TicketBookingSystem {

	
	    public synchronized void bookTicket(User user, Show show) {
	        if (show.bookTicket()) {
	            System.out.println("Success: " + user.getName() + " booked a ticket for " + show.getTitle());
	        } else {
	            System.out.println("Error: " + user.getName() + " could not book a ticket for " + show.getTitle() + " (Sold Out)");
	        }
	    }
	}

