package com.oop.inhertance;

public class Vehicle {
	
	String make;
	String model;
	int year;
	
	
	public Vehicle (String make,String model,int year)
	{
		this.make = make;
		this.model = model;
		this.year= year;
		
		if(year<=0)
		{
			System.out.println("Error invalid input");
		}
	}
	
	public void displayVehicleDetails()
	{
		System.out.println("Make is :"+make);
		System.out.println("Model is :"+model);
		System.out.println("year is :"+year);
	}
}

class Car extends Vehicle
{
	int  noofDoors;
	
	public Car(String make,String model,int year,int noofDoors)
	{
		super(make,model,year);
		this.noofDoors = noofDoors;
		
		if (noofDoors<=0||year<=0)
		{
			System.out.println("Error invalid input");
		}
	}
	
	public void displayCarInfo()
	{
		super.displayVehicleDetails();
		System.out.println("no of doors is :"+noofDoors);
	}
	
	
}

class Bike extends Vehicle
{
	String type;
	
	public Bike(String make,String model,int year,String type)
	{
		super(make,model,year);
		this.type = type;
	}
	
	public void displayBikeInfo()
	{
		super.displayVehicleDetails();
		System.out.println("Type is :"+type);
	}
}
