package Debitosh;

public class TwoDigitMultiply {
	
	public static int getMultiplyofdigits(int num)
	{
		int firstdigit=num%10;
		int seconddigit=num/10;
		
		return firstdigit*seconddigit;
	}

}
