package com.nit.m1;

import java.util.Scanner;

public class MainRoundNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x = sc.nextInt();
		
		System.out.println("Enter second Number:");
		int y=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int z= sc.nextInt();
		
		int output= RoundNumber.getRoundprev(x, y, z);
		
		System.out.println("The output is"+output);
		
		sc.close();
	}

}
