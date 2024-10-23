package com.concurrenteventmanagement.www;

public class EventAlreadyCompletedException extends RuntimeException {
	public EventAlreadyCompletedException(String message) {
		super(message);
	}
}
