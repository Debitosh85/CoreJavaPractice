package com.absract.java;

public interface AdvanceArithmetic {
     
	public abstract int divisorSum(int a);
}

class MyCalculator implements AdvanceArithmetic
{
	int sum=0;
	@Override
	public int divisorSum(int a)
	{
        for(int i=1;i<=a;i++) 
        {
        	if(a%i==0)
        	{
        		sum+=i;
        		
        	}
        }
        if(a==0)
        {
        	System.err.println("Number should be greater than Zero");
        	System.exit(0);
        	return 0;
        }
        else if( a < 0)
        {
        	System.out.println("Positive Number");
        	System.exit(0);
        	return 0;
        }
        else
        {
        	System.out.println("Sum is :"+sum);
        	return sum;
        }    
		
	}
}
