package com.concurrenteventmanagement.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Manager implements Comparator<Event>{
	private ConcurrentHashMap<Integer, Event> events;

	public Manager() {
		super();
		this.events = new ConcurrentHashMap<Integer, Event>();
	}
	
	public synchronized void addEvent(Event event) {
		if(events.containsKey(event.getEventId())) {
			throw new DuplicateEventException("Duplicate already exists!");
		}
		events.put(event.getEventId(), event);
		System.out.println("Event successfully added!");
	}
	
	public synchronized void markEvent(int eventId) {
		Event event = events.get(eventId);
		if(event != null) {
			if("completed".equalsIgnoreCase(event.getStatus())) {
				throw new EventAlreadyCompletedException("Event completed already successfully!");
			}
			else {
				event.setStatus("completed");
				System.out.println("Event status changed successfully!");
			}
		}
		else {
			throw new EventDoesNotExistException("Event doesn't exist!");
		}
	}
	
	public synchronized void editNameOfEvent(int eventId, String newName) {
		Event event = events.get(eventId);
		if(event != null) {
			event.setName(newName);
			System.out.println("Event name changed successfully!");
		}
		else {
			throw new EventDoesNotExistException("Event doesn't exist!");
		}
	}
	
	public Event searchEventByName(String name) {
		for(Event event : events.values()) {
			if(event.getName().equalsIgnoreCase(name)) {
				return event;
			}
		}
		throw new EventDoesNotExistException("Event does not exist!");
	}
	
	public void displayAllEvents() {
		List<Event> eventsList = new ArrayList<Event>(events.values());
		Collections.sort(eventsList,this);
		for(Event event : eventsList) {
			System.out.println(event);
		}
	}

	@Override
	public int compare(Event o1, Event o2) {
		int dateComparison = o1.getDate().compareTo(o2.getDate());
		if(dateComparison != 0) {
			return dateComparison;
		}
		int status1 = getStatusPriority(o1.getStatus());
		int status2 = getStatusPriority(o2.getStatus());
		return Integer.compare(status1, status2);
	}
	
	private int getStatusPriority(String status) {
		switch(status.toLowerCase()) {
		case "upcoming":
			return 2;
		case "completed":
			return 1;
		default:
			return 0;
		}
	}
}
