package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import javax.validation.constraints.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TASKLISTS")
public class TaskList {
	private int id;
	private String listName;
	private String description;
	private List<Task> tasks = new ArrayList<>(); //pole zawierające listę zadań należących do listy

	public TaskList() {
	}

	public TaskList(String listName, String description) {
		this.listName = listName;
		this.description = description;
	}
	@Id
	@GeneratedValue
	@NotNull
	@Column(name="ID", unique = true)
	public int getId() {
		return id;
	}

	@NotNull
	@Column(name="LISTNAME")
	public String getListName() {
		return listName;
	}

	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@OneToMany( //info dla Hibernate, że relacja 1:N
			targetEntity = Task.class,//deskryptor klasy encji,kt. znajduje się po prawej stronie relacji 1:N
			mappedBy = "taskList",//wskazuje pole encji z prawej strony relacji 1:N, które przechowuje ref. do obiektu encjipo lewej stronie 1:N
			//sygnalizuje, że relacja jest obustronna(mając obiekt po lewej stronie możemy odszukać obiekt po prawej strnie i odwrotnie
			cascade = CascadeType.ALL, //to samo co w relacji 1:1
			fetch = FetchType.LAZY//to samo co w relacji 1:1
	)
	public List<Task> getTasks() {
		return tasks;
	}

	private void setId(int id) {
		this.id = id;
	}

	private void setListName(String listName) {
		this.listName = listName;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
}
