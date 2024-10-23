package com.onlinebookstore.www;

import java.util.*;

public class Cart {
	private List<Book> orderBooks;

	public Cart() {
		super();
		this.orderBooks = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		orderBooks.add(book);
		System.out.println("Added to cart successfully!");
	}
	
	public void placeOrder(String address) {
		System.out.println("Address: " + address);
		if(orderBooks.isEmpty())
			throw new EmptyCartException("Cart is empty!");
		if(!(address == null || address.trim().isEmpty()))
			throw new InvalidAddressException("Invalid Address!");
		System.out.println("Placing order to the shipping address: " + address);
	}
}
