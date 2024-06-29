package com.app.tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Status;
import com.app.core.Task;
import com.app.custom_ordering.TaskComparator;

import co.app.utils.TaskUtils;
import co.app.utils.t;

public class Tasktester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;

			Map<Integer, Task> tasks = new HashMap<>();
			while (!exit) {
				System.out.println("options: 1. Add New Task " + "2.show all task details                      \r\n"
						+ "3. Delete a task                         \r\n" + "4. Update task status               \r\n"
						+ "5. Display all pending tasks     \r\n"
						+ "6. Display all pending tasks for today           \r\n"
						+ "7.  Display all tasks sorted by taskDate   ");

				System.out.println("enter your choice");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("add details: TaskName,description,date,currstatus,active");
						Task task = TaskUtils.addTask(sc.next(), sc.next(), sc.next());
						tasks.put(task.getTaskId(), task);
						System.out.println("task added");
						break;

					case 2:
						System.out.println("al task detals");
						for (Task t : tasks.values()) {

							System.out.println(t);
						}

						break;
					case 3:
						System.out.println("enter id to detlete");
						TaskUtils.deleteTask(sc.nextInt(), tasks);
						System.out.println("task deleted");

						break;
					case 4:
						System.out.println("enter id to update status");
						TaskUtils.updatetask(sc.nextInt(), sc.next(), tasks);
						System.out.println("status updated");
						break;   
						
					case 5:
//						System.out.println("pending tasks are");
//						Task task1 = TaskUtils.displaypendngtask(tasks);
//						System.out.println(task1);

						break;

					case 6:
						Task t2=TaskUtils.displayPendeingtaskTodday(tasks);
						System.out.println(t2);
						break;
					
					case 7:
//						Collections.sort(tasks,new TaskComparator());
						
						Collections.sort(tasks.values(),new TaskComparator());
						break;
						}
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}
	}

}
