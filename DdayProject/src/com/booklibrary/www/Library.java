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
		if(books.contains(book.getISBN()))
			throw new BookNotFoundException("Book does not exist!");
		books.add(book);
		System.out.println("Book added to the library successfully!");
	}
	
	public void removeBook(String title) {
		Book removeBook = findBookByTitle(title);
		if(books.isEmpty())
			throw new EmptyLibraryException("Library is empty!");
		if(removeBook == null)
			throw new BookNotFoundException("Book does not exist!");
		books.remove(removeBook);
		System.out.println("Book removed successfully from the library!");
	}
	
	private Book findBookByTitle(String title) {
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title))
				return book;
		}
		return null;
	}
	
	public Book searchBook(String title) {
		Book searchBook = findBookByTitle(title);
		if(books.isEmpty())
			throw new EmptyLibraryException("Library is empty!");
		if(searchBook == null)
			throw new BookNotFoundException("Book does not exist!");
		return searchBook;
	}
}
