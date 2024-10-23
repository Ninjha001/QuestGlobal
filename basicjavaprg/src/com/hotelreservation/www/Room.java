package com.hotelreservation.www;

import java.util.Objects;

public class Room {
	private int roomId;
	private String roomType;
	private double pricePerNight;
	private boolean isAvailable;
	public Room(int roomId, String roomType, double pricePerNight) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.isAvailable = true;
	}
	public int getRoomId() {
		return roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", pricePerNight=" + pricePerNight
				+ ", isAvailable=" + isAvailable + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(roomId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return roomId == other.roomId;
	}
	
}
