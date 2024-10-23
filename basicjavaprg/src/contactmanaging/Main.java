package contactmanaging;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContactManager manager = new ContactManager();
		Scanner scanner = new Scanner(System.in);
		try {
			manager.addContact(new Contact("UshaDevi", "91-9895110664", "ushadevikarunakaran@gmail.com"));
			manager.addContact(new Contact("Binu Vimalan", "91-8547000781", "binvin68@yahoo.com"));
			manager.addContact(new Contact("Manju P", "91-8547885781", "manjbinuv@gmail.com"));
			manager.addContact(new Contact("Neerja Binu Vimalan", "91-8590148231", "nbv@gmail.com"));
			
			System.out.println("All Contacts");
			manager.displayAllContacts();
			System.out.println("-------------");
			System.out.println("Enter the name of contact to be searched: ");
			String nameToBeSearched = scanner.nextLine();
			System.out.println(manager.findContactByName(nameToBeSearched));
			System.out.println("-------------------------------------------");
			System.out.println("Enter the name of the contact to be updated");
			String nameToBeUpdated = scanner.nextLine();
			System.out.println("Enter the new phone number: ");
			String phoneNumberToBeUpdated = scanner.nextLine();
			System.out.println("Enter the email to be updated: ");
			String emailToBeUpdated = scanner.nextLine();
			manager.updateContact(nameToBeUpdated, phoneNumberToBeUpdated, emailToBeUpdated);
			System.out.println("--------------------------------");
			manager.displayAllContacts();
			System.out.println("--------------------------------");
			System.out.println("Enter the name of the contact to be removed: ");
			String nameToBeRemoved = scanner.nextLine();
			manager.removeContact(nameToBeRemoved);
			System.out.println("----------------------------------------------");
			manager.displayAllContacts();
			System.out.println("----------------------------------------------");
			manager.displayByEmailDomain();
			
		}
		catch(DuplicateContactException | ContactNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scanner.close();
		}
		
	}

}
