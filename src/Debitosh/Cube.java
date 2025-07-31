package Debitosh;

public class Cube {

	public static void main(String[] args) {
		
		int side = Integer.parseInt(args[0]);
		
		double surface=6*Math.pow (side, 2);
		
		System.out.println("Curved Suface area of cube :"+surface);
	}

}
