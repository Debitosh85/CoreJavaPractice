package com.nit.m1;

import java.util.*;

class Array 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int sum = sc.nextInt();
		int temp = n;
		
		while(n<0)
		{
			r = n % 10;
			sum= sum + 10 * r;
			n = n/10;
		
		}
		if(sum==temp)
		{
			System.out.println("This is a Pallindrome no");
		}
		
	}
}
