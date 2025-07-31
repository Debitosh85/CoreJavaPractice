package com.oop.inhertance;

public class Family {
	
	public void house()
	{
		System.out.println("3 BHK");
	
	}
}

class son extends Family
{
	public void car() 
	{ 
		System.out.println("Tata");
	}
	
	public void house()
	{    
		System.out.println("2 BHK");
	}
	
			
}
