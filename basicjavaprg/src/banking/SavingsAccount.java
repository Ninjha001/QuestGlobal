package banking;

public class SavingsAccount extends BankAccount{
	public static final double rate = 0.04;
	public SavingsAccount(String accountNumber, double accountBalance) {
		super(accountNumber,accountBalance);
	}
	
	public void calculateInterest() {
		double interest = accountBalance*rate;
		System.out.println("Calculated Interest for Savings Account : $"+interest);
	}
}
