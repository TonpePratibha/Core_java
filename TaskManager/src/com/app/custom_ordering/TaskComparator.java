package com.app.custom_ordering;

import java.util.Comparator;

import com.app.core.Task;

public class  TaskComparator implements Comparator<Task>{
	@Override
	public int compare(Task t1,Task t2) {
             return t1.getTaskdate().compareTo(t2.getTaskdate());		
	
	}
}
