package com.app.ticketbooking;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charecter");
		char ch = sc.next().charAt(0);
		System.out.println((ch>='a' && ch<='z')?"Lowercase":(ch>='A'&&ch<='Z')?"UpperCase":"Not a valid Charecter");
		sc.close();
	
	}

}
