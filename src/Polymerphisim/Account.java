package Polymerphisim;

public class Account {
	
	String accountNumber;
	double balance;
	
	public Account(String accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public Account generateStatement()
	{
		System.out.println("Account Number is:"+accountNumber);
		System.out.println("Current Balance is:"+balance);
		return this;
	}
}

class SavingAccount extends Account
{
	double intrestRate;
	
	public SavingAccount(String accountNumber,double balance,double intrestRate)
	{
		super(accountNumber,balance);
		this.intrestRate = intrestRate;
	}
	
	@Override
	public SavingAccount generateStatement()
	{
		System.out.println("Saving AccountNumber is:"+accountNumber);
		System.out.println("SavingAccount Current Balance is:"+balance);
		System.out.println("SavingAccount Intrest rate is:"+intrestRate+"%");
		return this;
	}
}

class CheckingAccount extends Account
{
	double overdraftLimit;
	
	public CheckingAccount(String accountNumber,double balance,double overdraftLimit)
	{
		super(accountNumber,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public CheckingAccount generateStatement()
	{
		System.out.println(" Checking AccountNumber is:"+accountNumber);
		System.out.println(" Checking CurrentBalance is:"+balance);
		System.out.println(" Checking OverdraftLimit is:"+overdraftLimit);
		return this;
	}
}


