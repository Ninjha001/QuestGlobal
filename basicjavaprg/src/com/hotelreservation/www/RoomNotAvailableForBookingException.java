package com.hotelreservation.www;

public class RoomNotAvailableForBookingException extends RuntimeException {
	public RoomNotAvailableForBookingException(String message) {
		super(message);
	}
}
