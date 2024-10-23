package com.ecommerce.www;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Manager implements Comparator<Task>{
	private Set<Task> tasks;

	public Manager() {
		super();
		this.tasks = new HashSet<Task>(); 
	}
	
	public void addTask(Task task) {
		if(!tasks.add(task))
			throw new DuplicateTaskException("Duplicate already exists");
		System.out.println("Task added successfully!");
	}
	
	public void removeTask(String taskId) {
		Task removeTask = findTaskById(taskId);
		if(removeTask == null)
			throw new TaskNotFoundException("Task does not exist");
		tasks.remove(removeTask);
		System.out.println("Task removed successfully!");
	}
	
	public void markTaskCompleted(String taskId) {
		Task markTask = findTaskById(taskId);
		if(markTask == null)
			throw new TaskNotFoundException("Task does not exist");
		if(markTask.getStatus().equalsIgnoreCase("complete"))
			throw new TaskAlreadyCompletedException("Task is already completed!");
		markTask.setStatus("complete");
		System.out.println("Status changed successfully!");
	}
	
	
	
	private Task findTaskById(String taskId) {
		for(Task task : tasks) {
			if(task.getTaskId().equalsIgnoreCase(taskId))
				return task;
		}
		return null;
	}

	@Override
	public int compare(Task o1, Task o2) {
		String priority1 = o1.getPriority();
		String priority2 = o2.getPriority();
		return priority1.compareTo(priority2);
	}
}
