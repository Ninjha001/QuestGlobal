package com.atm.www;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	
	public Account(String accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public double withDraw(double amount) {
		if(amount < 0)
			throw new InvalidAmountException("Amount should be positive");
		if(balance < amount)
			throw new InsufficientFundsException("Insufficient Balance!");
		return balance += amount;
	}
	public double deposit(double amount) {
		if(amount < 0)
			throw new InvalidAmountException("Amount should be positive");
		return balance += amount;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
