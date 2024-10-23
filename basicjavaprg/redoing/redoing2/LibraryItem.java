package redoing2;

public class LibraryItem {
	protected String title;
	private String id;

	LibraryItem(){
		this.title = "Unknown";
		this.id = "00000";
	}
	
	LibraryItem(String title, String id){
		this.title = title;
		this.id = id;
	}
	
	public void getDetails() {
		System.out.println("TITLE: " + title);
		System.out.println("ID: " + id);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getId() {
		return id;
	}
}
