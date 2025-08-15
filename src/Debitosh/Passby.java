package Debitosh;

/*public class Passby{
 public static void main(String[] args) {
	 
	 int x = 200;
	 accept(x);
	 System.out.println("The Value of x is "+x); 
}
 
 public static void accept(int y) {
	 
	 y = 200;
 }
}

*/

class Passby {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40};
		
		accept(arr);
		
		System.out.println("Value at 0 th Index"+arr[0]);
		
	}
	
	public static void accept(int ar[]) {
		
		ar = new int[] {10,20,30};
		
		System.out.println(ar[1]);
		
	}
}


