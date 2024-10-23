package com.contactmanaging.www;

import java.util.*;


public class Manager implements Comparator<Contact> {
	private Set<Contact> contacts;

	public Manager() {
		super();
		this.contacts = new HashSet<Contact>();
	}
	
	public void addContact(Contact contact) {
		if(!contacts.add(contact))
			throw new DuplicateContactException("Duplicate already exists!");
		System.out.println("Contact added successfully!");
	}
	
	public void removeContact(String contactName) {
		Contact removeContact = findContactByName(contactName);
		if(removeContact == null)
			throw new ContactNotFoundException("Contact doesn't exist!");
		contacts.remove(removeContact);
		System.out.println("Contact removed successfully!");
	}
	
	public void displayByEmailDomain() {
		String emailDomain = "@gmail.com";
		List<Contact> emails = new ArrayList<Contact>();
		int count =0;
		for(Contact contact : contacts) {
			
			String email = contact.getEmail();
			if(email.endsWith(emailDomain)) {
				emails.add(contact);
				++count;
			}
		}
		
		System.out.println("Filtered Gmail Emails: " + emails);
		System.out.println("The count is: "+ count);
	}
	
	public void display() {
		List<Contact> contactList = new ArrayList<Contact>(contacts);
		Collections.sort(contactList,this);
		for(Contact contact : contactList) {
			System.out.println(contact);
		}
	}
	
	public Contact findContactByName(String contactName) {
		for(Contact contact : contacts) {
			if(contact.getName().equalsIgnoreCase(contactName))
				return contact;
		}
		return null;
	}

	@Override
	public int compare(Contact o1, Contact o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
}
