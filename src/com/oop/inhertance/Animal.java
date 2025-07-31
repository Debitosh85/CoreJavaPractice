package com.oop.inhertance;

public class Animal {
	
	private String name;
	
	public Animal ( String name)
	{
		this.name = name;
		
		if(name==null)
		{
			System.out.println("Error Invali Input");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDetails()
	{
		System.out.println("Animal name is :"+name);
	}
}

class Mamal extends Animal
{
	private boolean hasFur;
	
	public Mamal(String name,boolean hasFur)
	{
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	public void displayFurDetails()
	{
		super.displayDetails();
		System.out.println("Fur is fur :"+hasFur);
	}
}

class Dog extends Mamal
{
	private String breed;
	
	public Dog (String name,boolean hasFur ,String breed)
	{
		super(name,hasFur);
		this.breed = breed;
		
		if(breed == null)
		{
			System.out.println("Error Invalid Input");
		}
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void displayDogDetails()
	{
		System.out.println("Dog Details");
		super.displayFurDetails();
		
		System.out.println("Breed is :"+breed);
	}
}


