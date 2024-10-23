package inventory;

public class ItemOutOfStockException extends Exception {
	public ItemOutOfStockException(String s) {
		super(s);
	}
}
