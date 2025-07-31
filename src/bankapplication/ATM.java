package bankapplication;

import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10023456789L, 300000);
        Customer cust = new Customer("Ravi", b1);

        Scanner sc = new Scanner(System.in);
        try (sc) {
            while (true) {
                System.out.println("Select an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Loan Application");
                System.out.println("5. Check Balance");
                System.out.println("6. Exit");
                System.out.print("Enter your option: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        try {
                            cust.getAccount().deposit(depositAmount);
                        } catch (InvalidAmountException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        try {
                            cust.getAccount().withdraw(withdrawAmount);
                        } catch (InSufficientFundsException | InvalidAmountException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Enter account number to transfer to: ");
                        long toAccountNumber = sc.nextLong();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = sc.nextDouble();
                        BankAccount toAccount = new BankAccount(toAccountNumber, 0); // Dummy account for demonstration
                        try {
                            cust.getAccount().transfer(toAccount, transferAmount);
                        } catch (InSufficientFundsException | AccountNotFoundException | InvalidAmountException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Enter loan amount: ");
                        double loanAmount = sc.nextDouble();
                        try {
                            cust.getAccount().applyForLoan(loanAmount);
                        } catch (LoanNotFoundException | InvalidAmountException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Current balance: " + cust.getAccount().getBalance());
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }

        }
    }
}
