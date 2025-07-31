package Debitosh;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]);
		
		int temp=n;
		int sum=0;
		int r;
		
		while(n>0)
		{
			 r=n%10;
			 sum=(sum*10+r);
			 n = n/10;
			
		}
		
		if(temp==sum) {
			System.out.println("This no is pallindrome"+temp);
		}
		
		else
		{
			System.out.println("This no is not pallindrome"+temp);
		}	
		
	}

}
