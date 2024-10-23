package contactmanaging;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactManager implements Comparator<Contact> {
	private Set<Contact> h;
	
	public ContactManager(){
		h = new HashSet<Contact>();
	}
	
	public void addContact(Contact c){
		if(!h.add(c)) {
			throw new DuplicateContactException("Contact for " + c.getName() + " already exists!");
		}
	}
	
	public void removeContact(String name) {
		Contact toRemove = findContactByName(name);
		if(toRemove == null) {
			throw new ContactNotFoundException("Contact details under the name " + name + " cannot be found");
		}
		h.remove(toRemove);
	}
	
	public void updateContact(String name, String phoneNumber, String email){
		Contact existingContact = findContactByName(name);
		if(existingContact == null) {
			throw new ContactNotFoundException("Contact details under the name " + name + " cannot be found");
		}
		removeContact(name);
		addContact(new Contact(name,phoneNumber,email));
	}
	
	public Contact findContactByName(String name) {
		for(Contact contact : h) {
			if(contact.getName().equalsIgnoreCase(name)) {
				return contact;
			}
		}
		return null;
	}
	
	public void displayAllContacts() {
		List<Contact> contactList = new ArrayList<Contact>(h);
		Collections.sort(contactList,this);
		for(Contact contact : contactList) {
			System.out.println(contact);
		}
	}

	@Override
	public int compare(Contact o1, Contact o2) {
		Contact c1 = (Contact)o1;
		Contact c2 = (Contact)o2;
		String name1 = c1.getName();
		String name2 = c2.getName();
		return name1.compareTo(name2);
	}
	
	public void displayByEmailDomain() {
		String emailDomain = "@gmail.com";
		List<Contact> emails = new ArrayList<Contact>();
		int count =0;
		for(Contact contact : h) {
			
			String email = contact.getEmail();
			if(email.endsWith(emailDomain)) {
				emails.add(contact);
				++count;
			}
		}
		
		System.out.println("Filtered Gmail Emails: " + emails);
		System.out.println("The count is: "+ count);
	}
}
