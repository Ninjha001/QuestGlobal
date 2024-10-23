package redoing7;

public class Customer {
	private String customerId;
	private String name;
	private String email;
	
	public Customer(String customerId, String name, String email) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public void displayCustomer() {
		System.out.println("Customer Id: " + customerId);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer email: " + email);
	}
}
