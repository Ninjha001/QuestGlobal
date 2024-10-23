package com.booklibrary.www;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;

	public Library() {
		super();
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		if(books.isEmpty())
			throw new EmptyLibraryException("Library is Empty!");
		books.add(book);
		System.out.println("Book added successfully!");
	}
	
	public void removeBook(String title) {
		Book removeBook = findBookByTitle(title);
	}
	
	public Book findBookByTitle(String title) {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title))
				return book;
		}
		return null;
	}
	
}
