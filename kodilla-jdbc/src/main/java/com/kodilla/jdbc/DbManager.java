package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
	private Connection conn; //conn przechowuje referencję do obiektu reprez. połączenie do bazy danych
	//Connection - interfejs(z biblio java.sql, ma metody związane z zadawaniem zapytań do b.d. czy obsługą połączenia
	private static DbManager dbManagerInstance; //dbManagerInstance- referencja do instancji klasy DbManager (ma być tylko
	// jedna instancja obiektu klasy DbManager w pamięci komputera

	private DbManager() throws SQLException {//priv, więc nie można go wywołać zpoza metod klasy DbManager
		Properties connectionProps = new Properties();//ob. kl properties(podobna od hashmap
		connectionProps.put("user", "kodilla_user"); //ustawia właściwość user oraz password
		connectionProps.put("password", "kodilla_password");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
				"&useSSL=False", connectionProps); // połączenie z b.d. za poomocą metody statycznej (getConnection(String url,Properties info)
	}

	public static DbManager getInstance() throws SQLException {//tworzy obiekt wtedy, gdy jest potrzebny, czyli przy peirwszym wywołaniu tej metody
		if (dbManagerInstance == null) {
			dbManagerInstance = new DbManager();
		}
		return dbManagerInstance;
	}

	public Connection getConnection() {
		return conn; //zwraca obiekt  przechowujący połączenie z b.d.- używany do tworzenia zapytań do bazy danych
	}
}
