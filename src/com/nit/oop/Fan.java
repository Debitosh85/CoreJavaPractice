package com.nit.oop;

public class Fan {
	
	String name;
	String coil;
	int wing;
	
	public void switchon ()
	{
		System.out.println("Fan company :" + name);
		System.out.println("Fan coil is :" + coil);
		System.out.println("This fan have" +  wing  +  "wings");
		
		System.out.println("Fan turned on");
	}
	
	public void switchoff ()
	{
		System.out.println("Fan turned off");
	}

}


