package redoing1;

public abstract class BankAccount {
	protected String accountNo;
	protected double balance;
	
	BankAccount(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public abstract double calculateInterest();
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance = balance - amount;
			System.out.println("Updated balance after withdrawal: $" + balance);
		}else {
			System.out.println("Insufficient Funds");
		}
	}
}
