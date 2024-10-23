package com.hotelreservation.www;

class AddRoomTask implements Runnable{
	private Manager manager;
	private Room room;
	
	public AddRoomTask(Manager manager, Room room) {
		super();
		this.manager = manager;
		this.room = room;
	}

	@Override
	public void run() {
		try {
			manager.addRoom(room);
			Thread.sleep(5000);
		}
		catch(RoomAlreadyExistsException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

class BookRoomTask implements Runnable{
	private Manager manager;
	private int roomId;
	
	public BookRoomTask(Manager manager, int roomId) {
		super();
		this.manager = manager;
		this.roomId = roomId;
	}

	@Override
	public void run() {
		try {
			manager.bookRoom(roomId);
			Thread.sleep(5000);
		}
		catch(RoomNotAvailableForBookingException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class CancelBookRoomTask implements Runnable{
	private Manager manager;
	private int roomId;
	
	public CancelBookRoomTask(Manager manager, int roomId) {
		super();
		this.manager = manager;
		this.roomId = roomId;
	}

	@Override
	public void run() {
		try {
			manager.cancelBookedRoom(roomId);
			Thread.sleep(5000);
		}
		catch(RoomNotBookedException | RoomNotFoundException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

class CheckOut implements Runnable{
	private Manager manager;
	private int roomId;
	private int days;
	
	public CheckOut(Manager manager, int roomId, int days) {
		super();
		this.manager = manager;
		this.roomId = roomId;
		this.days = days;
	}

	@Override
	public void run() {
		try {
			manager.checkOut(roomId, days);
			Thread.sleep(5000);
		}
		catch(RoomNotFoundException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
