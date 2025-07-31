package com.nit.m1;

import java.util.*;

import Debitosh.TwoDigitMultiply;

public class MainTwoDigitSum { //ELC

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Two digit no:");
		
	    int digit = sc.nextInt();
	    
	    int sum= TwoDigitSum.getSumofDigit(digit);
	    
	    System.out.println("Sum of two digit no is"+sum);
	    
	    int multi=TwoDigitMultiply.getMultiplyofdigits(digit);
	    
	    System.out.println("Multiplication is "+multi);
	    
	    sc.close();
	    
	    
	    
	    
		
		

}
	
}
