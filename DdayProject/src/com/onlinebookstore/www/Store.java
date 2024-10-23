package com.onlinebookstore.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class Store {
	private Map<String,Book> books;

	public Store() {
		super();
		this.books = new HashMap<String,Book>();
	}
	
	public void addBook(Book book) {
		books.put(book.getISBN(), book);
	}
	
	public Book searchBookByTitle(String title) {
		for(Book book : books.values()) {
			if(book.getBookTitle().equalsIgnoreCase(title))
				return book;
		}
		throw new BookNotFoundException("Book does not exist in the store!");
	}
	
	public void addToCart(Cart cart, String title) {
		Book book = searchBookByTitle(title);
		if(book.getQuantity() == 0)
			throw new OutOfStockException("Book out of stock in store!");
		cart.addBook(book);
		book.reduceQuantity();
	}
}
