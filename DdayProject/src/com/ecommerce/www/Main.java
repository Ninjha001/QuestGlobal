package com.ecommerce.www;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("PID374", "A/C", 25000, 3);
		Product product2 = new Product("PID374", "Refrigerator", 45000, 2);
		
		Customer customer = new Customer("CID7437", "Nakshathra", "nakshathra@gmail.com");
		
		Order order = new Order("OID7346", customer);
		
		order.addItem(product1, 1);
		order.addItem(product2, 1);
		order.calculateTotal();
		
	}

}
