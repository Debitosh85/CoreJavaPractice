package com.nit.oop;

public class Product {
	
	String laptopname;
	double laptopprice;
	int laptopid;
	
	public void setProductdata (int id,double price,String name)
	{
		laptopid = id ;
		laptopprice= price;
		laptopname= name;
		
	}
	
	public void getProductInfo()
	{
		System.out.println("Laptop id is"+laptopid);
		System.out.println("Laptop price is"+laptopprice);
		System.out.println("Laptop name is "+laptopname);
		
	}

}
