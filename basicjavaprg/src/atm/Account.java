package atm;

public class Account {
	private String accountNo;
	private String name;
	private double balance;
	
	public Account(String accountNo, String name, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException{
		if(balance>=amount) {
			balance = balance - amount;
			return balance;
		}else {
			throw new InsufficientFundsException("INSUFFICIENT BALANCE");
		}
	}
}
