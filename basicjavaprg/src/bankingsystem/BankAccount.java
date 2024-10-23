package bankingsystem;

public class BankAccount {
    
    // Static fields
    private static int totalAccounts = 0; // Tracks total number of accounts

    // Instance fields
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Static block to initialize static variables and print a message
    static {
        System.out.println("Static block executed.");
    }

    // Instance initialization block
    {
        System.out.println("Instance initialization block executed.");
    }

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Constructor executed for account: " + accountHolderName);
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Instance method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit executed for account: " + accountHolderName + ", Amount: " + amount);
    }

    // Instance method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw executed for account: " + accountHolderName + ", Amount: " + amount);
        } else {
            System.out.println("Insufficient funds for account: " + accountHolderName);
        }
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Creating instances of BankAccount
        BankAccount account1 = new BankAccount(101, "John Doe", 500.0);
        BankAccount account2 = new BankAccount(102, "Jane Smith", 300.0);

        // Demonstrating static and instance methods
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());

        account1.deposit(150.0);
        account2.withdraw(50.0);
        
        // Attempt to withdraw more than the balance
        account2.withdraw(300.0);

        System.out.println("Main method ended.");
    }
}
