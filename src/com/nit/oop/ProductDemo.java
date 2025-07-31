package com.nit.oop;

import java.util.*;
public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product laptop = new Product ();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter laptop id");
		
		int pid = sc.nextInt();
		
		System.out.println("Enter laptop price");
		
		double pprice= sc.nextDouble();
		
		System.out.println("Enter laptop name");
		
		String pname = sc.nextLine();
		pname = sc.nextLine();
		
		laptop.setProductdata(pid,pprice,pname);
		
		laptop.getProductInfo();
		
		sc.close();
		
	
		
	}

}
