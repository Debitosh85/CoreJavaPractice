package Exam2;

public class Car {
	
	String brand;
	String model;
	private Engine engine;
	
	public Car(String brand,String model) 
	{
		this.brand = brand;
		this.model = model;
		this.engine = new Engine("V8");
	}
	
	void displayDetails()
	{
		System.out.println("Car brand is :"+brand);
		System.out.println("Car model is :" +model);
	}

	void startCar()
	{
		System.out.println("Starting the car");
		engine.startEngine();
		
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}
	
	

}
