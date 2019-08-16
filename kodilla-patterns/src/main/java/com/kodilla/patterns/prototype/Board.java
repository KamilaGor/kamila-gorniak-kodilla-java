package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype { //dzięki extneds nasza kl została oznaczona jako obsługująca klonowanie (Prototype imp interface Cloneable)
	private String name; // pole name
	private Set<TaskList> lists = new HashSet<>(); // zbiór list z zadaniami - przy głebokim klonowaniu bez final

	public Board(String name) {
		this.name = name;
	}

	public void setName(String name) { //setter umożliwia wstawinie nowej wartości w polu name po sklonowaniu obiektu typu Board (przy name nie ma final)
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<TaskList> getLists() {
		return lists;
	}

	@Override
	public String toString() {
		String s = "Board [" + name + "] \n";
		for (TaskList list : lists) {
			s = s + list.toString() + "\n";
		}
		return s;
	}

	public Board shallowCopy() throws CloneNotSupportedException { //płytkie klonowanie
		return (Board) super.clone();
	}

	public Board deepCopy() throws CloneNotSupportedException {
		Board clonedBoard = (Board) super.clone();
		clonedBoard.lists = new HashSet<>();
		for (TaskList theList : lists) {
			TaskList clonedList = new TaskList(theList.getName());
			for (Task task : theList.getTasks()) {
				clonedList.getTasks().add(task);
			}
			clonedBoard.getLists().add(clonedList);
		}
		return clonedBoard;
	}
}
