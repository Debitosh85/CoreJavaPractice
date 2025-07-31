package Test;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double pi = 3.14;
		
		System.out.println("Enter the radius for Circle:");
		Double radius = sc.nextDouble();
		
		Double  Area = pi * radius * radius;
		
		System.out.println("Area of Circle is :"+Area);
		
		sc.close();
		
	}

}
