package com.java.has_a_relation2;

public class Car {
	
	private Engine engine;
	
	public Car() {
		
		engine = new Engine("Diesel");
		engine = new Engine();
	}
	
	public void drive() {
		engine.Start();
		System.out.println("Car is Moving");
	}

}
