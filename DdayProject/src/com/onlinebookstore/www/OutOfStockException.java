package com.onlinebookstore.www;

public class OutOfStockException extends RuntimeException {
	public OutOfStockException(String message) {
		super(message);
	}
}
