package com.onlinebookstore.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Store store = new Store();
		
		store.addBook(new Book("The Monk who sold his Ferari", "Robin Sharma", "ISBN648", 3, 60));
		store.addBook(new Book("Atomic Habits", "James Clear", "ISBN65", 2, 59));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to the online BookStore!");
			System.out.println("1. Search a book");
			System.out.println("2. Add a book");
			System.out.println("3. Place order");
			System.out.println("4. Exit");
			System.out.println("Select an option");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				System.out.println("enter the name of the book to be searched");
				String searchName = scanner.nextLine();
				try {
					System.out.println(store.searchBookByTitle(searchName));
				}
				catch(BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("enter the name of the book");
				String name = scanner.nextLine();
				try {
					store.addToCart(cart, name);
				}
				catch(BookNotFoundException | OutOfStockException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("enter the shipping address");
				String address = scanner.nextLine();
				try {
					cart.placeOrder(address);
				}
				catch(InvalidAddressException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Exiting program...");
				scanner.close();
				System.exit(0);
			}
		}
	}

}
