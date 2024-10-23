package com.concurrenteventmanagement.www;

public class EventDoesNotExistException extends RuntimeException {
	public EventDoesNotExistException(String message) {
		super(message);
	}
}
