package com.nit.m1;

public class RoundNumber {
	
	public static int getRoundprev(int x,int y,int z)
	{
		return roundofnearest10(x) + roundofnearest10(y)+roundofnearest10(z);
		
	}
	
	public static int roundofnearest10(int num)
	{
		return ((num+5 )/10)*10;
	}

}
