package banking;

public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SA2345", 4000);
		System.out.println("Savings Account Details: ");
		System.out.println("--------------------");
		sa.calculateInterest();
		sa.deposit(230.76);
		sa.withdraw(100.00);
		
		CurrentAccount ca = new CurrentAccount("CA1234", 90000);
		System.out.println("Current Account Details: ");
		System.out.println("--------------------");
		ca.calculateInterest();
		ca.deposit(20);
		ca.withdraw(10000);
	}

}
