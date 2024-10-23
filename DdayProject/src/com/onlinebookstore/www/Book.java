package com.onlinebookstore.www;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private double price;
	private int quantity;
	public Book(String bookTitle, String author, String iSBN, int quantity, double price) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = iSBN;
		this.price = price;
		this.quantity = quantity;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public String getISBN() {
		return ISBN;
	}
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void reduceQuantity() {
		if(quantity > 0)
			--quantity;
	}
	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}
