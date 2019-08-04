package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
	@Test
	public void testGetBooks() {
		//Given
		Library list = new Library("LLL1");
		list.books.add(new Book("one", "AA", LocalDate.of(2001, 01, 01)));
		list.books.add(new Book("two", "BB", LocalDate.of(2002, 02, 02)));
		list.books.add(new Book("three", "CC", LocalDate.of(2003, 03, 03)));
		list.books.add(new Book("four", "DD", LocalDate.of(2004, 04, 04)));
		list.books.add(new Book("five", "EE", LocalDate.of(2005, 05, 05)));

		//making a shallow clone of object library
		Library clonedList = null;
		try {
			clonedList = list.shallowCopy();
			clonedList.setName("LLL2");
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		System.out.println(list);
		System.out.println(clonedList);

		//When
		//Then
		Assert.assertEquals(5, list.books.size());
		Assert.assertEquals(5, clonedList.books.size());
	}
}
