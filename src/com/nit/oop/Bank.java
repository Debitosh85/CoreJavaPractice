package com.nit.oop;

public class Bank {
	
	String BankName;
	String BankCustomerName;
	String BankAdress;
	String BankIfscCode;
	int customerAccountNumber;
	int CurrentBalance;
	
	public void SetDetails(String Bankname,String Customername,String BankAdress,String Bankifsccode,int CustomerAccountNumber,int Currentbalance)
	{
		
		this.BankName=Bankname;
		this.BankCustomerName= Customername;
		this.BankAdress=BankAdress;
		this.BankIfscCode=Bankifsccode;
		this.customerAccountNumber=CustomerAccountNumber;
		this.CurrentBalance=Currentbalance;
		
	}
	
	public void withdraw (double amount)
	{
		if (CurrentBalance <=1000)
		{
			System.out.println("insufficient Balance");
		}
		
		else if (CurrentBalance - amount < 1000 )
		{
			System.out.println("Maintain minimum balance");
		}
		
		else if (CurrentBalance - amount>= 1000)
		{
			System.out.println("Transaction Sucessful");
			System.out.println("Available balance is  "+CurrentBalance);
			
		}
		
	}
	public void deposit (double amount)
	{
		if (amount >=1000)
		{
			System.out.println("updated balance is:="+(double)(CurrentBalance+ amount)) ;
		}
		
		}
	
	public void CurrentBalance ()
	{
		System.out.println("CurrentBalance = "+this.CurrentBalance);
	}
	
	@Override
	public String toString() {
		return "Bank [BankName=" + BankName + ", BankCustomerName=" + BankCustomerName + ", BankAdress=" + BankAdress
				+ ", BankIfscCode=" + BankIfscCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", CurrentBalance=" + CurrentBalance + "]";
	}
	
	
	

}
