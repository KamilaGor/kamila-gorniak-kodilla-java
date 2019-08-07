package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
	@Test
	public void testGetBooks() {
		//Given
		Library list = new Library("LLL1");
		Book book1 = new Book("one", "AA", LocalDate.of(2001, 01, 01));
		list.books.add(book1);
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

		//making a deep clone of object library
		Library deepClonedList = null;
		try {
			deepClonedList = list.deepCopy();
			deepClonedList.setName("LLL3");
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		//When
		list.books.remove((book1));
		//Then
		System.out.println(list);
		System.out.println(clonedList);
		System.out.println(deepClonedList);
		Assert.assertEquals(4, list.books.size());
		Assert.assertEquals(4, clonedList.books.size());
		Assert.assertEquals(5, deepClonedList.books.size());
	}
}
