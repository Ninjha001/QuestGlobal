package com.hotelreservation.www;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Scanner scanner = new Scanner(System.in);
		
		Room room1 = new Room(1, "A/C", 600);
		Room room2 = new Room(12, "Non A/C", 300);
		Room room3 = new Room(10, "Delux A/C", 800);
		Room room4 = new Room(4, "Non A/C Single", 250);
	
		Thread addRoomThread1 = new Thread(new AddRoomTask(manager, room1));
		Thread addRoomThread2 = new Thread(new AddRoomTask(manager, room2));
		Thread addroomThread3 = new Thread(new AddRoomTask(manager, room3));
		Thread addRoomThread4 = new Thread(new AddRoomTask(manager, room4));
		
		
		try {
			addRoomThread1.start();
			addRoomThread1.join();
			addRoomThread2.start();
			addRoomThread2.join();
			addroomThread3.start();
			addroomThread3.join();
			addRoomThread4.start();
			addRoomThread4.join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("ALL ROOMS");
		System.out.println("---------");
		manager.displayAllRooms();
		System.out.println();
		
		
		while(true) {
			System.out.println("Enter the room number to be booked or '0' to stop booking");
			int roomNumber = scanner.nextInt();
			if(roomNumber == 0) {
				break;
			}
			Thread bookRoomThread = new Thread(new BookRoomTask(manager, roomNumber));
			bookRoomThread.start();
			
			try {
				bookRoomThread.join();
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		System.out.println();
		System.out.println("ALL UNBOOKED ROOMS");
		System.out.println("----------------");
		manager.displayAvailableRooms();
		System.out.println();
		
		while(true) {
            System.out.println("Do you want to cancel any booked rooms? Enter room number or '0' to skip:");
            int cancelRoomNumber = scanner.nextInt();
            if(cancelRoomNumber == 0) {
                break;
            }
            Thread cancelRoomThread = new Thread(new CancelBookRoomTask(manager, cancelRoomNumber));
            cancelRoomThread.start();
            
            try {
                cancelRoomThread.join();
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
		
		System.out.println("Enter the number of days for checkout");
		int days = scanner.nextInt();
		for(Room room : manager.getBookedRooms()) {
			manager.checkOut(room.getRoomId(), days);
		}
		
		scanner.close();
//		manager.checkOut(10, 6);
		
	}
}
