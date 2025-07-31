package Test;

public class ArrayCalculationOnlength {

	public static void main(String[] args) {
		
		if(args.length==0) {
			System.err.println("Length of the Array is 0");
		}
		else if(args.length==1) {
			
			int num = Integer.parseInt(args[0]);
			System.out.println("Cube of"+num+"is"+(num* num * num));
		}else {
			int num = Integer.parseInt(args[0]);
			int num1 = Integer.parseInt(args[1]);
			System.out.println("Sum of the numbers is:"+(num+num1));
		}
		

	}

}
