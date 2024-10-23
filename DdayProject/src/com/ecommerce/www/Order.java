package com.ecommerce.www;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String orderId;
	private Customer customer;
	private List<Product> items;
	public Order(String orderId, Customer customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.items = new ArrayList<Product>();
	}
	public String getOrderId() {
		return orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public List<Product> getItems() {
		return items;
	}
	public void addItem(Product product, int quantity) {
		if(quantity > 0) {
			product.setQuantity(quantity);
			items.add(product);
			System.out.println("Added product: "+product.getProductName()+" to the cart");
		}
		else {
			System.out.println("Invalid quantity. Quantity cannot be negative or zero");
		}
	}
	public void removeItem(String productId) {
		boolean removed = false;
		for(Product item : items) {
			if(item.getProductId().equalsIgnoreCase(productId)) {
				items.remove(item);
				removed = true;
				System.out.println("Item "+item.getProductName()+" removed from order");
				break;
			}
		}
		if(!removed)
			System.out.println("Product "+productId+" does not exist in order");
	}
	public void calculateTotal() {
		double totalPrice = 0;
		for(Product item : items) {
			if(items.isEmpty()) {
				System.out.println("Cart is empty");
				break;
			}
			else {
				totalPrice += item.getPrice();
			}
		}
		System.out.println("Total Price: "+totalPrice);
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", items=" + items + ", getOrderId()="
				+ getOrderId() + ", getCustomer()=" + getCustomer() + ", getItems()=" + getItems() + "]";
	}
	
}
