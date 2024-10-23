package redoing1;

public class CurrentAccount extends BankAccount {
	CurrentAccount(String accountNo,double balance){
		super(accountNo,balance);
	}
	@Override
	public double calculateInterest() {
		System.out.println("No interest on current savings account");
		return 0.0;
	}

}
