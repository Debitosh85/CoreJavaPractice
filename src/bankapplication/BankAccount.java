package bankapplication;

// import javax.naming.InsufficientResourcesException;

public class BankAccount implements Bank {

    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("amount should be greater than 0");
        } else {
            balance += amount;
            System.out.println("Amount deposited successfully" + balance);
        }
    }

    @Override
    public void withdraw(double amount) throws InSufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("amount should be greater than 0");

        } else if (amount > balance) {
            throw new InSufficientFundsException("Insufficient funds");
        }

        else {
            balance -= amount;
            System.out.println("Amount withdrawed" + amount);
        }

    }

    @Override
    public void transfer(Bank toAccount, double amount)
            throws InSufficientFundsException, AccountNotFoundException, InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("amount should be greater than 0");
        } else if (amount > balance) {
            throw new InSufficientFundsException("Insufficient funds");
        } else if (toAccount == null) {
            throw new AccountNotFoundException("Account not found");
        } else {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Amount transfered successfully");
        }
    }

    @Override
    public void applyForLoan(double amount) throws LoanNotFoundException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("amount should be greater than 0");
        } else if (amount >= 50000) {
            throw new LoanNotFoundException("Loan amount exceed");
        } else {
            System.out.println("Loan has been approved");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
