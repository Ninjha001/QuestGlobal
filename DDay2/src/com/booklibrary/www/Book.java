package com.booklibrary.www;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	public Book(String title, String author, String iSBN) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getISBN() {
		return ISBN;
	}
	
}
