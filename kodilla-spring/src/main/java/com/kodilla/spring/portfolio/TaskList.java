package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class TaskList {

	private List<String> tasks;

	public TaskList() {
		tasks = new ArrayList<>();
	}
	//Utwórz również klasę TaskList w tym samym pakiecie - powinna ona zawierać właściwość List<String> tasks.
	//Jej zawartość powinna być inicjowana w konstruktorze przy pomocy polecenia tasks = new ArrayList<>();
	public List<String> getTasks() {
		return tasks;
	}
	public void addTask(String task) {
		tasks.add(task);
	}
}
