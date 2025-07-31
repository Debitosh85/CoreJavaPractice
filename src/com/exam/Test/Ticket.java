package com.exam.Test;

public class Ticket {
	
	String source;
	String destiNation;
	double price;
	
	public Ticket(String source,String destination,double price)
	{
		this.source = source;
		this.destiNation = destination;
		this.price =  price;
	}
	
	public void displayTicketDetails()
	{
		System.out.println("Source of the ticket is:"+source);
		System.out.println("Destination to go for:"+destiNation);
		System.out.println("Price of the Ticket is:"+price);
	}
}

class TrainTicket extends Ticket
{
	String trainNumber;
	
	public TrainTicket(String source,String destination,double price,String trainNumber)
	{
		super(source,destination,price);
		this.trainNumber = trainNumber;
	}
	
	@Override
	public void displayTicketDetails()
	{
		System.out.println("Source of the ticket is:"+source);
		System.out.println("Destination to go for:"+destiNation);
		System.out.println("Price of the Ticket is:"+price);
		System.out.println("TrainNumber is:"+trainNumber);
	}
}

class BusTicket extends Ticket
{
	String busCompanyName;
	
	public BusTicket(String source,String destination,double price,String busCompanyName)
	{
		super(source,destination,price);
		this.busCompanyName = busCompanyName;
	}
	@Override
	public void displayTicketDetails()
	{
		System.out.println("Source of the ticket is:"+source);
		System.out.println("Destination to go for:"+destiNation);
		System.out.println("Price of the Ticket is:"+price);
		System.out.println("Bus Company name is:"+busCompanyName);
	}
}

class FlightTicket extends Ticket
{
	String flightNumber;
	
	public FlightTicket(String source,String destination,double price,String flightNumber)
	{
		super(source,destination,price);
		this.flightNumber = flightNumber;
	}
	
	@Override
	public void displayTicketDetails()
	{
		System.out.println("Source of the ticket is:"+source);
		System.out.println("Destination to go for:"+destiNation);
		System.out.println("Price of the Ticket is:"+price);
		System.out.println("Flight Number is :"+flightNumber);
	}
}


