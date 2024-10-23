package banking;

public class CurrentAccount extends BankAccount {
	public CurrentAccount(String accountNumber,double accountBalance) {
		super(accountNumber,accountBalance);
	}
	
	public void calculateInterest() {
		System.out.println("No Interest for Current Account");
	}
}
