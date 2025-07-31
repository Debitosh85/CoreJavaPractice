package com.oop.inhertance;

public class CalculationBase {
	
	int num1;
	int num2;
	
	
	public CalculationBase()
	{
		super();
	}
	
	public CalculationBase(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void performCalculation()
	{
		System.out.println("Sum is:"+(num1+num2));
	}
}

class AdvancedCalculation extends CalculationBase
{   double additionalNum1;
	double additionalNum2;
	String operation;
	
    AdvancedCalculation()
	{
		super();
	}
    
    AdvancedCalculation(int num1,int num2,double additionalNum1,String operation)
    {
    	super(num1,num2);
    	this.additionalNum1 = additionalNum1;
    	this.operation = operation;
    }
    
    public void peformAdvancedCalculation()
    {
    	
    	System.out.println(  "Complex operation is "+(num1*num2)+" "+(additionalNum1+ "" +operation));
    }
}
