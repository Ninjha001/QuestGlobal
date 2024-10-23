package com.atm.www;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Account account = new Account("AccNo3689", "Akash Bhaskar", 20000);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to the ATM!");
			System.out.println("1. Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			System.out.println("Select your option");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				System.out.println("Account Balance: "+account.getBalance());
				break;
			case 2:
				try {
					System.out.println("enter the amount to withdraw");		
					double amount = scanner.nextDouble();
					System.out.println("Balance after withdrawal: "+account.withDraw(amount));
				}
				catch(InvalidAmountException | InsufficientFundsException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("enter the amount to be deposited");
					double amount = scanner.nextDouble();
					System.out.println("Balance after deposit: "+account.deposit(amount));
				}
				catch(InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Exiting program....");
				scanner.close();
				System.exit(0);
			}
		}
	}
}
