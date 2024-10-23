package banking;


public abstract class BankAccount {
	protected  String accountNumber;
	protected  double accountBalance;
	
	BankAccount(String accountNumber, double accountBalance){
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public abstract void calculateInterest();
	
	public void deposit(double amount) {
		accountBalance += amount;
		System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + accountBalance);
	}
	
	public void withdraw(double amount) {
		if(accountBalance>=amount) {
			accountBalance -= amount;
			System.out.println("Withdrawn: $" + amount);
	        System.out.println("New Balance: $" + accountBalance);
		}else {
			System.out.println("Insufficient funds!!");
		}
		
	}
}
