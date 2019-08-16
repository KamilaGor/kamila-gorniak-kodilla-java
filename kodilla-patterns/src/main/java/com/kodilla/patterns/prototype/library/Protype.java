package com.kodilla.patterns.prototype.library;

public class Protype<Library> implements Cloneable {
	@Override
	public Library clone() throws CloneNotSupportedException {

		return (Library) super.clone();
	}
}
