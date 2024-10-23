package redoing1;

public class SavingsAccount extends BankAccount {
	SavingsAccount(String accountNo,double balance){
		super(accountNo,balance);
	}
	@Override
	public double calculateInterest() {
		double interest = 0.04 * 1 * balance;
		System.out.println("The interest on " + balance + " is $" + interest);
		return interest;
	}

}
