package Debitosh;

import java.util.*;
public class naturalnumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n =sc.nextInt();
		
		int Sum= (n*(n+1)/2);
		
		System.out.println("The sum of first "+n+ "Natural numbers"+Sum);
		
		sc.close();
		
	
		
	}

}
