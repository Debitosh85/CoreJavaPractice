package com.nit.oop;

public class Bankdemo {
	public static void main(String[] args) {
		
		Bank cash = new Bank();
		
		
		cash.SetDetails("SBI", "JIBAN", "ODISHA", "TX456", 123456, 20000);
		cash.withdraw(5000);
		cash.deposit(0);
		cash.CurrentBalance();
		System.out.println(cash);
		
	}

}
