package Debitosh;


import java.util.*;

public class Table
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int num= sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int num2=num*i;
			System.out.println(num+"X"+i+"="+num2);
		}
		sc.close();
	}
}
