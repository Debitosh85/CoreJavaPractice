package com.java.multithreading;


class Consumer {
	
	int availableBalance = 2000;
	int withdrawBalance ;
	
	public Consumer(int withdrawBalance) {
		
		super();
		this.withdrawBalance = withdrawBalance;
	}
	
	public void withdraw() {
		
		String name = null;
		if(withdrawBalance<=availableBalance) {
			name = Thread.currentThread().getName();
			System.out.println(name+"has withdrawed all"+availableBalance);
			availableBalance = availableBalance - withdrawBalance;
		}else {
			name = Thread.currentThread().getName();
			System.out.println("Sorry!! name inSufficient Balance..");
		}
	}
}
public class BankApplication {
	public static void main(String[] args) {
		Consumer c = new Consumer(3000);
		Runnable r = ()->c.withdraw();
		
		Thread t = new Thread(r,"Debitosh...");
		Thread t2 = new Thread(r,"Demon..");
		t.start();
		t2.start();
	}
}
