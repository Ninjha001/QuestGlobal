package library;

public class Book extends LibraryItem {
	private String author;
	private int numberOfPages;
	
	Book(String title, String id,String author,int numberOfPages){
		super(title,id);
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	@Override
	public void getDetails() {
		System.out.println("Overriding case of Book");
		System.out.println("----------------");
		super.getDetails();
		System.out.println("Author: "+author);
		System.out.println("Number of Pages: "+numberOfPages);
		System.out.println();
	}
	
	public void getDetails(boolean includeAuthor) {
		System.out.println("Overloading case of Book");
		System.out.println("----------------");
		super.getDetails();
		if(includeAuthor) {
			System.out.println("Author: "+author);
			System.out.println("Number of Pages: "+numberOfPages);
			System.out.println();
		}
		else {
			System.out.println("Unable to detail the specifics of author and number of pages.");
			System.out.println();
		}
		
	}
}
