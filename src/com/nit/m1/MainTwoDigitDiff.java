package com.nit.m1;

import java.util.Scanner;

public class MainTwoDigitDiff {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two digit no:");
		
		int digit=sc.nextInt();
		
		int Diffresult= TwoDigitDifference.getDiffofDigits(digit);
		
		System.out.println("Difference of two digit is "+Diffresult);
		
		sc.close();
		
		
	}

}
