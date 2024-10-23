package com.concurrenteventmanagement.www;

public class DuplicateEventException extends RuntimeException {
	public DuplicateEventException(String message) {
		super(message);
	}
}
