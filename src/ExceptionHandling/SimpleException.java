package ExceptionHandling;
import java.util.*;

public class SimpleException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for a:");
		int a = sc.nextInt();
		
		System.out.println("Enter number for b:");
		int b= sc.nextInt();
		
		try 
		{
			int result = a/b;
			System.out.println("Result is :"+result);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("===============================");
			e.printStackTrace();
			System.out.println("===============================");
			System.out.println("No can't devide by Zero");
			System.out.println("===============================");
			System.out.println(e.toString());
		}
		System.out.println("Main method ended");
		sc.close();
	}

}
