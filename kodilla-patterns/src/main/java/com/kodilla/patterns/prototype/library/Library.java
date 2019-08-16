package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Protype {
	String name;
	Set<Book> books = new HashSet<>();

	public Library(final String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		return "Library{" +
				"name='" + name + '\'' +
				", books=" + books +
				'}';
	}

	public Library shallowCopy() throws CloneNotSupportedException {
		return (Library) super.clone();
	}

	public Library deepCopy() throws CloneNotSupportedException {
		Library libraryClone = (Library) super.clone();
		libraryClone.books = new HashSet<>();
		for (Book book : books) {
			libraryClone.books.add(book);
		}
		return libraryClone;
	}
}