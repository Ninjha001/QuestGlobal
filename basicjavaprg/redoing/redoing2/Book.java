package redoing2;

public class Book extends LibraryItem {
	private String author;
	private int numberOfPages;
	
	Book(String title, String id, String author,int numberOfPages){
		super(title,id);
		this.author=author;
		this.numberOfPages=numberOfPages;
	}

	public void getDetails() {
		System.out.println("BOOK AUTHOR: " + author);
		System.out.println("BOOK NUMBER OF PAGES: " + numberOfPages);
	}
	
	public void getDetails(boolean includeAuthor) {
		if(includeAuthor == true) {
			super.getDetails();
			this.getDetails();
		}
		else {
			System.out.println("Request is denied");
		}
	}

}
