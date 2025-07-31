package com.oop.inhertance;

public class OnlineShopping {
	
	protected String name;
	protected double price;
	
	
	public OnlineShopping (String name,double price )
	{
		this.name = name;
		this.price = price ;
	}
	
	public void displayinfo()
	{
		System.out.println("Name of product is :"+ name);
		System.out.println("Price of the product is :"+price);
	}
	
	public int calculateTotalcost(int quantity)
	{
		int  totalcost = (int)  price * quantity;
		
		return totalcost;
	}
	
}
	
	
	class Electronic extends OnlineShopping
	{
		private String brand;
		
		public Electronic(String name,double price,String brand)
		{
			super(name,price);
			this.brand = brand;
			
		}
		
		public void displayinfo()
		{
			super.displayinfo();
			System.out.println("Brand name is :"+brand);
		}
	}
	
	class Clothing extends OnlineShopping
	{
		private String size;
		
		public Clothing (String name,double price,String size)
		{
			super(name,price);
			this.size = size;
		}
		
		public void displayinfo()
		{
			super.displayinfo();
			System.out.println("Size is :"+size);
		}
	}
	
	
	
	


