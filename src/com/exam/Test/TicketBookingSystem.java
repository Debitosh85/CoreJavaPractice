package com.exam.Test;

public class TicketBookingSystem {

	public static void main(String[] args) {
		
		TrainTicket t1 = new TrainTicket("INDIAN RAILWAY","Manali",50.00,"YX123");
		t1.displayTicketDetails();
		
		System.out.println("-------------------------------------");
		
		BusTicket b1 = new BusTicket("Make my trip","Goa",30,"XZ Company");
		b1.displayTicketDetails();
		
		System.out.println("-------------------------------------");
		
		FlightTicket f1 = new FlightTicket("Make my trip","Goa",30,"ABC123");
		f1.displayTicketDetails();
		
		
	}

}
