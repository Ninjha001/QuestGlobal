package com.ecommerce.www;

public class TaskAlreadyCompletedException extends RuntimeException {
	public TaskAlreadyCompletedException(String message) {
		super(message);
	}
}
