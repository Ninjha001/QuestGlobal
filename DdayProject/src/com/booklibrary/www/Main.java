package com.booklibrary.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to the library!");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Search Book");
			System.out.println("4. Exit");
			System.out.println("Select your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.println("enter the title of the book");
				String title = scanner.nextLine();
				System.out.println("enter the author");
				String author = scanner.nextLine();
				System.out.println("enter the ISBN");
				String ISBN = scanner.nextLine();
				library.addBook(new Book(title, author, ISBN));
				break;
			case 2:
				System.out.println("enter the title of the book to be removed");
				String removeBookTitle = scanner.nextLine();
				try {
					library.removeBook(removeBookTitle);
				}
				catch (BookNotFoundException | EmptyLibraryException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("enter the title of the book to be searched");
				String searchBook = scanner.nextLine();
				try {
					System.out.println(library.searchBook(searchBook));
				}
				catch(BookNotFoundException | EmptyLibraryException e) {
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
