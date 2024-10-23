package employeemanaging;

public class DuplicateEmployeeException extends RuntimeException {
	public DuplicateEmployeeException(String s) {
		super(s);
	}
}
