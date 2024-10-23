package com.hotelreservation.www;

public class RoomAlreadyExistsException extends RuntimeException {
	public RoomAlreadyExistsException(String message) {
		super(message);
	}
}
