package com.contactmanaging.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.addContact(new Contact("Neerja", "9895110664", "nbv@gmail.com"));
		manager.addContact(new Contact("Binu Vimalan", "8547885781", "binvin68@yahoo.com"));
		manager.addContact(new Contact("Manju", "9995079005", "manjbinuv@gmail.com"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Contact");
			System.out.println("2. Remove Contact");
			System.out.println("3. Search Contact By Name");
			System.out.println("4. Display All Contacts");
			System.out.println("5. Filter Contact by Email Domain");
			System.out.println("6. Exit");
			System.out.println();
			System.out.println("Enter an option:");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			case 1:
				System.out.println("enter the name of the contact");
				String contactName = scanner.nextLine();
				System.out.println("enter the phone number");
				String phoneNumber = scanner.nextLine();
				System.out.println("enter the email");
				String email = scanner.nextLine();
				try{
					manager.addContact(new Contact(contactName, phoneNumber, email));
				}
				catch(DuplicateContactException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("enter the name of the contact to be removed");
				String removeName = scanner.nextLine();
				try {
					manager.removeContact(removeName);
				}
				catch(ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("enter the name of the contact to be searched");
				String searchName = scanner.nextLine();
				try {
					manager.findContactByName(searchName);
				}
				catch(ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				manager.display();
				break;
			case 5:
				manager.displayByEmailDomain();
				break;
			case 6:
				System.out.println("Exiting program...");
				scanner.close();
				System.exit(0);
			}
		}
	}

}
