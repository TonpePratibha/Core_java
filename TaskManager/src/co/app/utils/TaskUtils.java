package co.app.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.app.Custome_exception.TaskException;
import com.app.core.Status;
import com.app.core.Task;

public class TaskUtils {

	static Map<Integer, Task> tasks = new HashMap<>();

	public static Task addTask(String TaskName, String description, String taskdate)
			throws TaskException {
         //, String status, boolean active
		LocalDate date = LocalDate.parse(taskdate);
		//Status currstatus = Status.valueOf(status.toUpperCase());
         
		//Task task = new Task(TaskName, description, date, currstatus, active);
		
		Task task=new Task(TaskName,description,date);
		task.setstatus(Status.PENDING);
		task.setActive(true);
		
		
		return task;

	}

	public static void updatetask(int taskId, String status, Map<Integer, Task> tasks) throws TaskException {
		Status st1 = Status.valueOf(status.toUpperCase());
//		boolean t1=tasks.containsKey(taskId);
		Task t1 = tasks.get(taskId);
		if(t1!=null)
		t1.setstatus(st1);
		throw new TaskException("id doesnt exist");

	}
public static void deleteTask(int TaskId ,Map<Integer,Task>tasks)throws TaskException{
	if(tasks.containsKey(TaskId))
		tasks.remove(TaskId);
	else
	throw new TaskException("id not found");
	
}

//public static void  displaypendngtask(Map<Integer,Task>tasks) throws TaskException{
//	
//	for(Task t:tasks.values())
//		if(t.getStatus().equals(Status.PENDING) && t.isActive())
//			return t;
//		else
//			
//			
//		
//	
//			
//	
//	
//	
//	
//}


public static Task displayPendeingtaskTodday(Map<Integer,Task>tasks)throws TaskException{
	
	      
	Task t1=null;
	for(Task t:tasks.values())
		if(t.getStatus()==Status.PENDING && t.getTaskdate()==LocalDate.now())
			t1=t;
	      
	
	return t1;
}




}
