package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="TASKS")
public class Task {
	private int id;
	private String description;
	private Date created;
	private int duration;

	public Task() {//Hibernate podczas odczytywania obiektów z bazy danych) używa bezparametrowego konstruktora
	}

	public Task(String description, int duration) {
		this.description = description;
		this.created = new Date();
		this.duration = duration;
	}
	@Id //oznaczenie dla klucza głównego
	@GeneratedValue //automatyczne generowanie wartości
	@NotNull
	@Column(name="ID", unique=true) // unikalne wartości unique=true
	//Jeżeli oznaczamy adnotacjami
	// akcesory (czyli getterów) zamiast pól, to konieczne jest również utworzenie zestawu setterów
	public int getId() {
		return id;
	}
	@Column(name="DESCRIPTION") //wymuszenie sposobu, w jaki mają być nazwane pola: Column(name="...")
	public String getDescription() {
		return description;
	}
	@NotNull //ograniczenie not null,powoduje również, że sam Spring w warstwie Javy również nie pozwoli aby to pole
	// było puste (zanim trafi do bazy danych)
	@Column(name="CREATED")
	public Date getCreated() {
		return created;
	}
	@Column(name="DURATION")
	public int getDuration() {
		return duration;
	}

	private void setId(int id) {//mogą mieć modyfikator=private, wówczas nikt nie będzie ich mógł wywołać spoza klasy
		// Dla Hibernate będą jednak w zupełności wystarczające.
		this.id = id;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private void setCreated(Date created) {
		this.created = created;
	}

	private void setDuration(int duration) {
		this.duration = duration;
	}
}
