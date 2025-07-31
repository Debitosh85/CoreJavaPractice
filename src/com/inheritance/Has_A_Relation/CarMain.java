package com.inheritance.Has_A_Relation;

public class CarMain {

	public static void main(String[] args) {
		
		Engine e1 = new Engine("v6 Hybrid");		
		Car c1 = new Car("Hyundai","Camry",e1);
	    System.out.println(c1);

	}

}
