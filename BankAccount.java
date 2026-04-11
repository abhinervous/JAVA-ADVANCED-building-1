// Program to demonstrate encapsulation using getters and setters

public class BankAccount {

    // Private variables (data hiding)
    // Cannot be accessed directly from outside the class
    private int accountNumber;
    private double balance;

    // Setter method to set account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber; // assign value using 'this'
    }

    // Setter method to set balance
    public void setBalance(double balance) {
        this.balance = balance; // assign value
    }

    // Getter method to get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter method to get balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        // Create object of BankAccount class
        BankAccount acc = new BankAccount();

        // Set values using setter methods
        acc.setAccountNumber(4758);
        acc.setBalance(7504003);

        // Access values using getter methods
        System.out.println("Account number : " + acc.getAccountNumber());
        System.out.println("Balance : " + acc.getBalance());
    }
}