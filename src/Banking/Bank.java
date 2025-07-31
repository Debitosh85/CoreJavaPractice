package Banking;

public class Bank {
	
	protected String bankName;
	protected String branchName;
	private double amount;
	private int year;
	public static  String ifscCode ;
	
	
	public Bank(String bankName,String branchName,String ifscCode)
	{
		this.bankName = bankName;
		this.branchName = branchName;
	}
	
	
	public void withdraw(double amount)
	{
		
	}
	
	public void deposit(double amount)
	{
		
	}
	
	/*
	 * public boolean transfer(double amount,BankAccount fromAccount,BankAccount
	 * toAccount) {
	 * 
	 * return false; }
	 */
	
	public double loan(double amount,int year)
	{
		this.amount = amount;
		this.year = year;
		
		return 0.0;
	}
	
}


