package com.java.has_a_relation2;

public class Engine {

	private String type;
	
	public Engine(String type) {
		this.type = type;
	}
	
	public Engine() {
		System.out.println("Engine is required");
	}
	
	
	public void Start() {
		System.out.println("Engine is Started");
	    System.out.println("Engine type is"+ type);
	}
}
