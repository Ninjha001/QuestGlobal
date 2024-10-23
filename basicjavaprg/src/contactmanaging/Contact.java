package contactmanaging;

import java.util.Objects;

public class Contact {
	private String name;
	private String phoneNumber;
	private String email;
	
	public Contact(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Name: "+getName() + " || " + "Phone Number: " + getPhoneNumber() + " || " + "Email: " + getEmail();
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || getClass() != obj.getClass()) 
			return false;
		Contact contact = (Contact) obj;
		return name.equalsIgnoreCase(contact.name);
	}
	
	public int hashCode() {
		return Objects.hash(name.toLowerCase());
	}
}
