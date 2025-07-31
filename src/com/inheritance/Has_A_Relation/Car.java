package com.inheritance.Has_A_Relation;

public class Car {
	
	private String make;
	private String model;
	private Engine engine;//has a relation
	
	public Car(String make,String model,Engine engine)
	{
		this.make = make;
		this.model= model;
		this.engine = new Engine("V6 Hybrid");
	}

	@Override
	public String toString() {
		return "Car make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
	
	

}
