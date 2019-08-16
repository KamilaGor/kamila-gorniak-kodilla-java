package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {
	private List<Book> generateListOfNBooks(int booksQuantity) {
		List<Book> resultList = new ArrayList<Book>();
		for (int n = 1; n <= booksQuantity; n++) {
			Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
			resultList.add(theBook);
		}
		return resultList;
	}

	@Test
	public void testListBooksWithConditionsReturnList() {
		//Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultListOfBooks = new ArrayList<Book>();
		Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
		Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
		Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
		Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
		resultListOfBooks.add(book1);
		resultListOfBooks.add(book2);
		resultListOfBooks.add(book3);
		resultListOfBooks.add(book4);
		when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
		//when
		List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
		//Then
		System.out.println(theListOfBooks.size());
		assertEquals(4, theListOfBooks.size());
	}

	@Test
	public void testListBooksWithConditionMoreThan20() {
		//Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultListOf0Books = new ArrayList<Book>();
		List<Book> resultListOf15Books = generateListOfNBooks(15);
		List<Book> resultListOf40Books = generateListOfNBooks(40);
		when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
		when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
		when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
		//When
		List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
		List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any Title");
		List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
		//Then
		assertEquals(0, theListOfBooks0.size());
		assertEquals(15, theListOfBooks15.size());
		assertEquals(0, theListOfBooks40.size());
	}

	@Test
	public void testListBooksWithConditionFragmentShorterThan3() {
		// Given
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultListOf10Books = generateListOfNBooks(10);
		when(libraryDatabaseMock.listBooksWithCondition(anyString()))
				.thenReturn(resultListOf10Books);
		// When
		List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
		// Then
		assertEquals(0, theListOfBooks10.size());
		verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
	}

	@Test
	public void testListBooksInHands() {
		//Given
		LibraryUser libraryUser0 = new LibraryUser("John", "Smith", "00000");
		LibraryUser libraryUser1 = new LibraryUser("John1", "Smith1", "11111");
		LibraryUser libraryUser5 = new LibraryUser("John5", "Smith5", "55555");
		LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
		BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
		List<Book> resultLibraryUserWithoutBooks = new ArrayList<Book>();
		System.out.println(resultLibraryUserWithoutBooks);
		List<Book> resultLibraryUserWith1Book = generateListOfNBooks(1);
		System.out.println(resultLibraryUserWith1Book);
		List<Book> resultLibraryUserWith5Books = generateListOfNBooks(5);
		System.out.println(resultLibraryUserWith5Books);
		when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(resultLibraryUserWithoutBooks);
		when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultLibraryUserWith1Book);
		when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(resultLibraryUserWith5Books);

		//when
		List<Book> emptyListBooks = bookLibrary.listBooksInHandsOf(libraryUser0);
		System.out.println(emptyListBooks);
		List<Book> theListBooksWith1 = bookLibrary.listBooksInHandsOf(libraryUser1);
		System.out.println(theListBooksWith1);
		List<Book> theListBooksWith5 = bookLibrary.listBooksInHandsOf(libraryUser5);
		System.out.println(theListBooksWith5);

		//Then
		assertEquals(0, emptyListBooks.size());
		assertEquals(1, theListBooksWith1.size());
		assertEquals(5, theListBooksWith5.size());
	}
}

