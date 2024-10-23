package library;

public class LibraryItem {
	protected String title;
	private String id;
	
	LibraryItem(){
		title = "Unknown";
		id = "0000";
	}
	
	LibraryItem(String title,String id){
		this.title = title;
		this.id = id;
	}
	
	public void getDetails() {
		System.out.println("Title: "+title);
		System.out.println("ID: "+id);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getID() {
		return id;
	}
}
