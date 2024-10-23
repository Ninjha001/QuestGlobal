package redoing2;

public class Magazine extends LibraryItem {
	private int issueNumber;
	private String publicationDate;
	
	Magazine(String title,String id,int issueNumber,String publicationDate){
		super(title,id);
		this.issueNumber=issueNumber;
		this.publicationDate=publicationDate;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("MAGAZINE ISSUE NUMBER: " + issueNumber);
		System.out.println("MAGAZINE PUBLICATION DATE: " + publicationDate);
	}
	
	public String updatePublicationDate(String date) {
		publicationDate = date;
		return publicationDate;
	}
}
