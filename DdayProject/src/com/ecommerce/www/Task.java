package com.ecommerce.www;

import java.util.Objects;

public class Task {
	private String taskId;
	private String description;
	private String priority;
	private String status;
	public Task(String taskId, String description, String priority, String status) {
		super();
		this.taskId = taskId;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}
	
	public String getTaskId() {
		return taskId;
	}

	public String getStatus() {
		return status;
	}

	public String getPriority() {
		return priority;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(taskId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(description, other.description) && Objects.equals(priority, other.priority)
				&& Objects.equals(status, other.status) && Objects.equals(taskId, other.taskId);
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", description=" + description + ", priority=" + priority + ", status="
				+ status + "]";
	}
	
}
