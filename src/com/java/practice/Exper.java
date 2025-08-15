package com.java.practice;

public class Exper {
    
interface Payment
{
	void makePayment();
}
public class AnonymousWithFunctionalInterface {

	public static void main(String[] args) 
	{
		Payment creditCard = new Payment() 
		{			
			@Override
			public void makePayment() 
			{
				System.out.println("Making payment through Credit Card");				
			}
		};
		
		Payment debitCard = new Payment() 
		{			
			@Override
			public void makePayment() 
			{
				System.out.println("Making payment through Debit Card");				
			}
		};
		
		creditCard.makePayment();  debitCard.makePayment();

	}

}
}
