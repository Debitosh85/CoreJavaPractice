package com.app.ticketbooking;

public class Show {
	
	
	    private int showId;
	    private String title;
	    private int totalTickets;
	    private int ticketsAvailable;

	    public Show(int showId, String title, int totalTickets) {
	        this.showId = showId;
	        this.title = title;
	        this.totalTickets = totalTickets;
	        this.ticketsAvailable = totalTickets;
	    }

	    public synchronized boolean bookTicket() {
	        if (ticketsAvailable > 0) {
	            ticketsAvailable--;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public synchronized int getTicketsAvailable() {
	        return ticketsAvailable;
	    }

	    public int getShowId() {
	        return showId;
	    }

	    public String getTitle() {
	        return title;
	    }
	}


