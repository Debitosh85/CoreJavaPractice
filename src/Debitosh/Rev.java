package Debitosh;

import java.util.Scanner;

public class Rev {
	
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a Char");
		        String str = sc.nextLine();

		        for (int i = 0; i <= str.length(); i++) {
		            System.out.println(str.charAt(i));
		        }

		        sc.close();
	}

}
