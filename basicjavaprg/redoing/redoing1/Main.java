package redoing1;

public class Main {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SA456", 20000);
		CurrentAccount ca = new CurrentAccount("CA8966", 10000);
		
		System.out.println("Savings Account Details");
		System.out.println("-----------------------");
		System.out.println("Account No: " + sa.accountNo);
		System.out.println("Available Balance: $ " + sa.balance);
		sa.calculateInterest();
		System.out.println("Updated balance after deposit: $" + sa.deposit(200));
		sa.withdraw(20200);
		
		System.out.println();
		
		System.out.println("Current Account Details");
		System.out.println("-----------------------");
		System.out.println("Account No: " + ca.accountNo);
		System.out.println("Available Balance: $ " + ca.balance);
		ca.calculateInterest();
		System.out.println("Updated balance after deposit: $ " + ca.deposit(0));
		ca.withdraw(10001);
	}

}
