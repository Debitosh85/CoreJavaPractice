package com.inheritance.Has_A_Relation;

public class Engine {
	
	private String model;
	
	public Engine(String model)
	{
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}

	
	
}
