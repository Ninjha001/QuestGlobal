package com.hotelreservation.www;

public class RoomNotFoundException extends RuntimeException {
	public RoomNotFoundException(String message) {
		super(message);
	}
}
