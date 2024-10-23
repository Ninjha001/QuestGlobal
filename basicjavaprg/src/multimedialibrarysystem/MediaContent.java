package multimedialibrarysystem;

public abstract class MediaContent {
	protected String title;
	protected String description;
	
	public MediaContent(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public abstract double calculateRentalCost(int days);
}
