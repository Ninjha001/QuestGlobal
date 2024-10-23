package atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {
		Account account = new Account("A356284", "ATHUL", 30000);
		
		System.out.println();
		System.out.print("ACCOUNT NUMBER: ");
		
		System.out.println();
		System.out.println();
		System.out.println("Welcome to the ATM");
		System.out.println("1. Balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.println();
				System.out.println("Enter the type of function to be performed: ");
				String type = scanner.nextLine();
				if(type.equalsIgnoreCase("Balance")){
					System.out.println("ACCOUNT BALANCE: $" + account.getbalance());
				}
				else if(type.equalsIgnoreCase("Withdraw")) {
					System.out.println("Enter the amount to be withdrawn");
					double amount = scanner.nextDouble();
					scanner.nextLine();
					try{
						if(amount<0) {
							throw new InvalidAmountException("ENTER A POSITIVE NUMBER");
						}
						else {
							System.out.println("UPDATED BALANCE AFTER WITHDRAWAL: $" + account.withdraw(amount));
						}
					}
					catch(InvalidAmountException | InsufficientFundsException e) {
						System.out.print(e.getMessage());
					}
					
				}
				else if(type.equalsIgnoreCase("Deposit")) {
					System.out.println("Enter the amount to be deposited");
					double amount = scanner.nextDouble();
					scanner.nextLine();
					try {
						if(amount<0) {
							throw new InvalidAmountException("ENTER A POSITIVE NUMBER");
						}
						else {
							System.out.println("UPDATED BALANCE AFTER DEPOSIT: $" +  account.deposit(amount));
						}
					}
					catch(InvalidAmountException e) {
						System.out.println(e.getMessage());
					}
					
				}
				else if(type.equalsIgnoreCase("Exit")) {
					System.out.println("THANK YOU");
					break;
				}
				else {
					System.out.println("Please enter a valid input!");
				}
			}	
			
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
		}
		
	}
}
