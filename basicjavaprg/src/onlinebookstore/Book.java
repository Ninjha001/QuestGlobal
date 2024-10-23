package onlinebookstore;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private int price;
	private int quantity;
	
	public Book(String title, String author, String iSBN, int price, int quantity) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.price = price;
		this.quantity = quantity;
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

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
}
