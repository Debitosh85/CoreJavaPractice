package com.oop.shallow_copy;

public class PassByValueDemo {

	public static void main(String[] args) {
		
		PassByValue pass = new PassByValue();
		
		 pass = accept(pass);
		
		System.out.println(pass.getCustomerbill());

	}
	
	public static PassByValue accept(PassByValue cust)
	{
		cust = new PassByValue();
		cust.setCustomerbill(18000);
		return cust ;
	
	}

}
