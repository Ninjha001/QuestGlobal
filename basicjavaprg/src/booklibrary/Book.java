package booklibrary;

public class Book {
	private String title;
	private String author;
	private int ISBN;
	
	Book(String title,String author,int ISBN){
		this.author=author;
		this.ISBN=ISBN;
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return ISBN;
	}
	
	
}
