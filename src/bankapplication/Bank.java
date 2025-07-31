package bankapplication;

public interface Bank {

    public void deposit(double amount) throws InvalidAmountException;

    void withdraw(double amount) throws InSufficientFundsException, InvalidAmountException;

    void transfer(Bank toAccount, double amount)
            throws InSufficientFundsException, AccountNotFoundException, InvalidAmountException;

    void applyForLoan(double amount) throws LoanNotFoundException, InvalidAmountException;

    double getBalance();
}
