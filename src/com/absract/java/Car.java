package com.absract.java;

abstract public class Car {
	
	private String brand;
	private String model;
	private int mileage ;
	private int top_speed ;
	private int yearOfManufacturing ;
	
	public Car()
	{
		brand="Audi";
		model="A8";
		mileage=10;
		top_speed=200;
		yearOfManufacturing=2024;
		
	}
	
	public String carModel()
	{
		return this.brand;
	}
	
	public String model()
	{
		return this.model;
	}
	
	public int carMileage()
	{
		return this.mileage;
	}
	
	public int carTopSpeed ()
	{
		return this.top_speed;
	}
	
	public int carYear()
	{
		return this.yearOfManufacturing;
	}
	public abstract void displayDetails();

}
