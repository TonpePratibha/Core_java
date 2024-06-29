package com.app.core;

import java.time.LocalDate;

public class Task {
	// taskId, taskName, description, taskDate, status, active.
	private int taskId;
	private String TaskName;
	private String description;
	private LocalDate taskdate;
	private Status status;
	private boolean active;
	private static int idgenerator = 0;

	public Task(String taskName, String description, LocalDate taskdate, Status status, boolean active) {
		super();
		this.taskId = ++idgenerator;
		this.TaskName = taskName;
		this.description = description;
		this.taskdate = taskdate;
		this.status = status;
		this.active = active;
	}

	
	
	
//	public Task(String taskName2, String description2, LocalDate date, Status currstatus, boolean active2) {
//		this.TaskName = taskName;
//		this.description = description;
//		this.taskdate = taskdate;
//		this.status = status;
//		this.active = active;
//	}

	

	public Task(String taskName2, String description2, LocalDate date) {
		this.taskId = ++idgenerator;
		this.TaskName = taskName2;
		this.description = description2;
		this.taskdate = date;
	}




	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return TaskName;
	}

	public void setTaskName(String taskName) {
		TaskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}

	public Status getStatus() {
		return status;
	}

	public void setstatus(Status status) {
		this.status=status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static int getIdgenerator() {
		return idgenerator;
	}

	public static void setIdgenerator(int idgenerator) {
		Task.idgenerator = idgenerator;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", TaskName=" + TaskName + ", description=" + description + ", taskdate="
				+ taskdate + ", status=" + status + ", active=" + active + "]";
	}

}
