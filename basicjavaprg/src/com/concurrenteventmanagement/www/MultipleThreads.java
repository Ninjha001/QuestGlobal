package com.concurrenteventmanagement.www;

class EventAddThread implements Runnable {
	private Manager manager;
	private Event event;
	
	public EventAddThread(Manager manager, Event event) {
		super();
		this.manager = manager;
		this.event = event;
	}

	public void run() {
		try {
			manager.addEvent(event);
			Thread.sleep(2000);
		}
		catch(DuplicateEventException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

class EventCompleteThread implements Runnable{
	private Manager manager;
	private int eventId;
	
	public EventCompleteThread(Manager manager, int eventId) {
		super();
		this.manager = manager;
		this.eventId = eventId;
	}

	@Override
	public void run() {
		try {
			manager.markEvent(eventId);
			Thread.sleep(2000);
		}
		catch(EventAlreadyCompletedException | InterruptedException | EventDoesNotExistException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

class EventUpdateName implements Runnable{
	private Manager manager;
	private int eventId;
	private String eventName;
	
	public EventUpdateName(Manager manager, int eventId, String eventName) {
		super();
		this.manager = manager;
		this.eventId = eventId;
		this.eventName = eventName;
	}

	@Override
	public void run() {
		try {
			manager.editNameOfEvent(eventId, eventName);
			Thread.sleep(2000);
		}
		catch(EventDoesNotExistException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
