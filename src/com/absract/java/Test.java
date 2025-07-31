package com.absract.java;

public class Test extends Car {

	@Override
	public void displayDetails() {
		System.out.println(super.carModel());
		System.out.println(super.model());
		System.out.println(super.carMileage());
		System.out.println(super.carTopSpeed());
		System.out.println(super.carYear());
		
	}

}
