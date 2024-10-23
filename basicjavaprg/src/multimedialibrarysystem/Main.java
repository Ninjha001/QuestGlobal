package multimedialibrarysystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaLibrary library = new MediaLibrary();

        // Input for content details
        System.out.print("Enter content ID: ");
        int contentId = scanner.nextInt();
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter rental duration (in days): ");
        int duration = scanner.nextInt();

        System.out.println();
        
        System.out.println("Displaying just the basic details");
        System.out.println("---------------------------------");
        library.displayContentDetails(contentId); 
        System.out.println();
        System.out.println("Displaying the personalised details");
        System.out.println("-----------------------------------");
        library.displayContentDetails(contentId, userId); 
        System.out.println();
        System.out.println("Displaying the personal as well as rental details");
        System.out.println("-------------------------------------------------");
        library.displayContentDetails(contentId, userId, duration); 

        scanner.close();
    }
}
