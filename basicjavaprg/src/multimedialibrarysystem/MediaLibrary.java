package multimedialibrarysystem;

class MediaLibrary {
    // Method to display content details by contentId
    public void displayContentDetails(int contentId) {
        MediaContent content = getContentById(contentId);
        if (content != null) {
            System.out.println("Content ID: " + contentId);
            System.out.println("Title: " + content.title);
            System.out.println("Description: " + content.description);
        } else {
            System.out.println("Content not found.");
        }
    }

    // Method to display personalized content details
    public void displayContentDetails(int contentId, int userId) {
        MediaContent content = getContentById(contentId);
        if (content != null) {
            System.out.println("Content ID: " + contentId);
            System.out.println("Title: " + content.title);
            System.out.println("Description: " + content.description);
            System.out.println("User ID: " + userId);
            System.out.println("Recommended for you: Great choice!");
        } else {
            System.out.println("Content not found.");
        }
    }

    // Method to display content details and rental cost
    public void displayContentDetails(int contentId, int userId, int duration) {
        MediaContent content = getContentById(contentId);
        if (content != null) {
            System.out.println("Content ID: " + contentId);
            System.out.println("Title: " + content.title);
            System.out.println("Description: " + content.description);
            System.out.println("User ID: " + userId);
            double rentalCost = content.calculateRentalCost(duration);
            System.out.printf("Rental Cost for %d days: $%.2f%n", duration, rentalCost);
        } else {
            System.out.println("Content not found.");
        }
    }

    // Simulated method to get content by ID
    private MediaContent getContentById(int contentId) {
        // Simulated data for demonstration
        switch (contentId) {
            case 1:
                return new Book("The Great Gatsby", "A novel by F. Scott Fitzgerald.");
            case 2:
                return new Music("Bohemian Rhapsody", "A song by Queen.");
            case 3:
                return new Video("Inception", "A film directed by Christopher Nolan.");
            default:
                return null; // Content not found
        }
    }
}
