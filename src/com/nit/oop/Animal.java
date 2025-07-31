package com.nit.oop;

public class Animal {
	
	String name ;
	double height;
	int age;
	String sound;
	
	public void getdoginformation ()
	{
		System.out.println("Dog name is name: "+ name);
		System.out.println("Dog height is : "+ height);
		System.out.println("Dog age is : "+age);
		
	}
	
	public void bark ()
	{
		System.out.println("Dog can bark like: " + sound);
	}
	

}
