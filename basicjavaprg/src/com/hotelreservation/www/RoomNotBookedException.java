package com.hotelreservation.www;

public class RoomNotBookedException extends RuntimeException {
	public RoomNotBookedException(String message) {
		super(message);
	}
}
