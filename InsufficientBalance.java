// Custom Exception class
// This exception will be thrown when balance is insufficient
class InsufficientBalanceException extends Exception {

    // Constructor to pass custom message
    public InsufficientBalanceException(String msg) {
        super(msg);  // calls parent Exception class constructor
    }
}

// Bank Account class
class BankAccount {

    double balance;  // variable to store account balance

    // Constructor to initialize balance
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    void withdraw(double amount) throws InsufficientBalanceException {

        // Check if balance is less than withdrawal amount
        if (amount > balance) {
            // Throw custom exception
            throw new InsufficientBalanceException("Insufficient Balance! Transaction Failed.");
        } else {
            balance = balance - amount;  // deduct amount
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Main class
public class InsufficientBalance {

    public static void main(String[] args) {

        // Create bank account with initial balance
        BankAccount user = new BankAccount(5000);

        try {
            // Try withdrawing amount
            user.withdraw(6000);  // This will cause exception

        } catch (InsufficientBalanceException e) {
            // Handle exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("----------------------");

        try {
            // Successful withdrawal
            user.withdraw(2000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}