package com.hotelreservation.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager{
	private Map<Integer, Room> rooms;

	public Manager() {
		super();
		this.rooms = new HashMap<Integer, Room>();
	}
	
	public synchronized void addRoom(Room room) {
		if(rooms.containsKey(room.getRoomId())) {
			throw new RoomAlreadyExistsException("Room under the id "+room.getRoomId()+" already exists!");
		}
		rooms.put(room.getRoomId(), room);
		System.out.println("Room under id "+room.getRoomId()+" added successfully!");
	}
	
	public synchronized void bookRoom(int roomId) {
		Room room = rooms.get(roomId);
		if(room == null) {
			throw new RoomNotFoundException("Room under id "+room.getRoomId()+" does not exist!");
		}
		if(!room.isAvailable()) {
			throw new RoomNotAvailableForBookingException("Room under id "+room.getRoomId()+" is currently booked!");
		}
		room.setAvailable(false);
		System.out.println("Room under id "+room.getRoomId()+" booked successfully!");
	}
	
	public synchronized void cancelBookedRoom(int roomId) {
		Room room = rooms.get(roomId);
		if(room == null) {
			throw new RoomNotFoundException("Room under id "+room.getRoomId()+" does not exist!");
		}
		if(room.isAvailable()) {
			throw new RoomNotBookedException("Room under id "+room.getRoomId()+" is  not booked");
		}
		room.setAvailable(true);
		System.out.println("Room under id "+room.getRoomId()+" has been cancelled!");
	}
	
	public void displayAvailableRooms() {
		List<Room> availableRooms = new ArrayList<Room>();
		for(Room room : rooms.values()) {
			if(room.isAvailable()) {
				availableRooms.add(room);
			}
		}
		if(availableRooms.isEmpty()) {
			System.out.println("No available rooms at the moment!");
		}
		else {
			System.out.println("Available rooms");
			for(Room room : availableRooms) {
				System.out.println(room);
			}
		}
	}
	
	public List<Room> getBookedRooms(){
		List<Room> bookedRooms = new ArrayList<Room>();
		for(Room room : rooms.values()) {
			if(!room.isAvailable()) {
				bookedRooms.add(room);
			}
		}
		return bookedRooms;
	}
	
	public void displayAllRooms() {
		List<Room> allRooms = new ArrayList<Room>();
		for(Room room : rooms.values()) {
			allRooms.add(room);
		}
		for(Room room : allRooms) {
			System.out.println(room);
		}
	}
	
	public synchronized void checkOut(int roomId, int days) {
		Room room = rooms.get(roomId);
		if(room == null) {
			throw new RoomNotFoundException("Room under id "+room.getRoomId()+" does not exist!");
		}
	    if (room.isAvailable()) {
	        System.out.println("Room under id " + roomId + " is not currently booked, no checkout possible.");
	        return;
	    }
		double totalCost = room.getPricePerNight() * days;
		System.out.println("Checked out from room with id "+room.getRoomId()+". Total amount due: $"+totalCost);
		room.setAvailable(true);
	}

}
