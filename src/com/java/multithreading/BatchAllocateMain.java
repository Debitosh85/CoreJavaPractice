package com.java.multithreading;

import java.util.InputMismatchException;
import java.util.Scanner;

class BatchAssignMent extends Thread{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(name!=null && name.equalsIgnoreCase("Placement")) {
			
			this.placementBatch();
		}
		else if(name!=null && name.equalsIgnoreCase("Regular")) {
			
			this.regularBatch();
		}
		else {
			throw  new NullPointerException();
		}
	}
	
	public void placementBatch() {
		System.out.println("i am a placementBatch Student");
	}
	
	public void regularBatch() {
		System.out.println("I am a Regualar Batch Student");
	}
}
public class BatchAllocateMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc){
			
			System.out.println("Enter name of the Batch:");
			String title = sc.nextLine();
			
			BatchAssignMent b = new BatchAssignMent();
			b.setName(title);
			
			b.start();
		}catch(InputMismatchException e) {
			System.out.println("Enter Value is can't be null...😁");
		}
	}
}
