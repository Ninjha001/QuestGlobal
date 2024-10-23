package com.concurrenteventmanagement.www;

import java.time.LocalDate;
import java.util.Objects;

public class Event {
	private int eventId;
	private String name;
	private String status;
	private LocalDate date;
	public Event(int eventId, String name, String status, LocalDate date) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.status = status;
		this.date = date;
	}
	public int getEventId() {
		return eventId;
	}
	public String getName() {
		return name;
	}
	public String getStatus() {
		return status;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", name=" + name + ", status=" + status + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eventId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return eventId == other.eventId;
	}
	
}
