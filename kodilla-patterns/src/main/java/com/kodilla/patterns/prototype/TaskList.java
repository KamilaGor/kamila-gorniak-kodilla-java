package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
	final private String name;
	final private List<Task> tasks = new ArrayList<>(); //AL zawiera listę obieków zadań

	public TaskList(final String name) { // konstruktor inicjujący nazwę
		this.name = name;
	}

	public List<Task> getTasks() { //getter daje dostęp listy zadań
		return tasks;
	}

	public String getName() { //getter daje dostęp nazwy
		return name;
	}

	@Override
	public String toString() {
		String s = "   List [" + name + "]";
		for (Task task : tasks) {
			s = s + "\n" + task.toString();
		}
		return s;
	}
}
