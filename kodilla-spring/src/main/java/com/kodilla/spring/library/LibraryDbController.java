package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;


public class LibraryDbController {
	public void saveData() { //zapisywanie stanu księgozbioru
		System.out.println("Saving data to the database");
	}

	public void loadData() { //odczytywanie stanu księgozbioru
		System.out.println("Loading data from the database");
	}
}
