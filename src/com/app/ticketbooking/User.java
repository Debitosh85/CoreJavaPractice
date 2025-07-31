package com.app.ticketbooking;

class User implements Runnable {
    private String name;
    private Show show;
    private TicketBookingSystem bookingSystem;

    public User(String name, Show show, TicketBookingSystem bookingSystem) {
        this.name = name;
        this.show = show;
        this.bookingSystem = bookingSystem;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(this, show);
    }

    public String getName() {
        return name;
    }
}
