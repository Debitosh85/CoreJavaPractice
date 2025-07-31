package com.oop.inhertance;

public class MainVehicle {

	public static void main(String[] args) {
		
		Car c1 = new Car("Hero","Vs-100",2021,4);
		c1.displayCarInfo();
		
		System.out.println("===================");
		
		Bike b1 = new Bike("Hayabusa","Hayabusa-303",2021,"sports");
		b1.displayBikeInfo();

	}

}
