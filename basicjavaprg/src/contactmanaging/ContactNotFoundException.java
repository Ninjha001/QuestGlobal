package contactmanaging;

public class ContactNotFoundException extends RuntimeException {
	ContactNotFoundException(String s){
		super(s);
	}
}
