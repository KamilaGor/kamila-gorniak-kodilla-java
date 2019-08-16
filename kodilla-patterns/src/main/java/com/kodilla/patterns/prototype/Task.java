package com.kodilla.patterns.prototype;

public final class Task {
	final private String name; // pole name

	public Task(final String name) { // konstruktor inicjujący pole name
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "    Task [ " + name + " ]";
	}
}
