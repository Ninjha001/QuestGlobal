package library;

public class Magazine extends LibraryItem{
	private int issueNumber;
	private String issueDate;
	
	Magazine(String title,String id,int issueNumber,String issueDate){
		super(title,id);
		this.issueNumber = issueNumber;
		this.issueDate = issueDate;
	}
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Issue Number: "+issueNumber);
		System.out.println("Issue Date: "+issueDate);
		System.out.println();
	}
	
	public void updatePublicationDate(String newDate) {
		issueDate = newDate;
	}
	
}
