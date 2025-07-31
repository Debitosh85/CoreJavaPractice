package bankapplication;

public class InSufficientFundsException extends Exception {

    public InSufficientFundsException(String message) {
        super(message);
    }

}

class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {

    public AccountNotFoundException(String message) {
        super(message);
    }
}

class LoanNotFoundException extends RuntimeException {

    public LoanNotFoundException(String message) {
        super(message);
    }
}