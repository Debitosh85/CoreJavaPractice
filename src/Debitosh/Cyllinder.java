package Debitosh;

public class Cyllinder {

	public static void main(String[] args) {
		
		
		double r= Double.parseDouble(args[0]);
		
		double h= Double.parseDouble(args[1]);
		
		float pi= 3.14F;
		
		double totalSurfaceArea=2*pi*r*(r+h);
		
		System.out.println("Curved Total Area of cyllinder:"+totalSurfaceArea);
		
		
	}

}
