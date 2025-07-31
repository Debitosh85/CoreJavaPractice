package com.oop.inhertance;

public class Ticket {

	private String eventName;
	private int seatNumber;
	private double price;
	
	public Ticket(String eventName,int seatNumber,double price)
	{
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int eventNumber) {
		this.seatNumber = eventNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayDetails()
	{
		System.out.println("Regular Tickets:");
		System.out.println("Event name is "+eventName);
		System.out.println("Seat Number is :"+seatNumber);
		System.out.println("Price is :"+price);
	}
}

class VipTicket extends Ticket
{
	private String specialAccess;
	
	public VipTicket(String eventName,int seatNumber,double price,String specialAccess)
	{
		super(eventName,seatNumber,price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}
}

class StudentTicket extends Ticket
{
	private boolean studentDiscount;
	
	public StudentTicket(String eventname,int seatNumber,double price,boolean studentDiscount)
	{
		super(eventname,seatNumber,price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	
	
}



