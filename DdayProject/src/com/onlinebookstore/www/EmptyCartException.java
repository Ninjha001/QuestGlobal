package com.onlinebookstore.www;

public class EmptyCartException extends RuntimeException {
	public EmptyCartException(String message) {
		super(message);
	}
}
