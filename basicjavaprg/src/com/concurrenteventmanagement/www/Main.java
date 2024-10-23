package com.concurrenteventmanagement.www;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		Event event1 = new Event(1, "Cooking", "upcomig", LocalDate.of(2024, 10, 10));
		Event event2 = new Event(2, "Cleaning", "upcoming", LocalDate.of(2024, 9, 15));
		Event event3 = new Event(3, "Gardening", "upcoming", LocalDate.of(2024, 9, 30));
		
		Thread addEventThread1 = new Thread(new EventAddThread(manager, event1));
		Thread addEventThread2 = new Thread(new EventAddThread(manager, event2));
		Thread addEventThread3 = new Thread(new EventAddThread(manager, event3));
	
		addEventThread1.start();
		addEventThread2.start();
		addEventThread3.start();
		
		try {
			addEventThread1.join();
			addEventThread2.join();
			addEventThread3.join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("ALL EVENTS");
		System.out.println("----------");
		manager.displayAllEvents();
		System.out.println();
		
		Thread completeEventThread1 = new Thread(new EventCompleteThread(manager, 1));
		Thread completeEventThread2 = new Thread(new EventCompleteThread(manager, 2));
		Thread nameUpdateThread1 = new Thread(new EventUpdateName(manager, 1, "Dressing"));
		
		completeEventThread1.start();
		completeEventThread2.start();
		nameUpdateThread1.start();
		
		try {
			completeEventThread1.join();
			completeEventThread2.join();
			nameUpdateThread1.join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("ALL EVENTS AFTER UPDATIONS");
		System.out.println("--------------------------------");
		manager.displayAllEvents();
		System.out.println();
		
		System.out.println(manager.searchEventByName("dressing"));
	}

}
