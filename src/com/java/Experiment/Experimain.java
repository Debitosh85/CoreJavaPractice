package com.java.Experiment;

 class Integr{
	
	public static int getSquare( int x) {
		return x * x;
	}
	
	public static int getCube(int y) {
		return y * y * y;
	}
}

public class Experimain{
	
	public static void main(String[] args) {
		
		int square = Integr.getSquare(10);
		System.out.println("Square is"+square);
		
		int cube = Integr.getCube(20);
		System.out.println("Cube is "+cube);
	}
}