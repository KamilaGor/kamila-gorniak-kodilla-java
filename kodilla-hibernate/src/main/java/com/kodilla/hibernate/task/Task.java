package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamedQueries({
		@NamedQuery( //zapytanie w języku HQL
				name="Task.retrieveLongTasks",
				query="FROM Task WHERE duration > 10"
		),
		@NamedQuery( //zapytanie w języku HQL
				name="Task.retrieveShortTasks",
				query="FROM Task WHERE duration <= 10"
		),
		@NamedQuery(
				name = "Task.retrieveTasksWithDurationLongerThan",
				query = "FROM Task WHERE duration > :DURATION"
		)
})
@NamedNativeQuery(
		name="Task.retrieveTasksWithEnoughTime",
		query = "SELECT * FROM TASKS WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5",
		resultClass = Task.class //deskryptor klasy, której obiekty będą zwracane
)
@Entity
@Table(name="TASKS")
public class Task {
	private int id;
	private String description;
	private Date created;
	private int duration;
	private TaskFinancialDetails taskFinancialDetails; //pole przechowujące referencję do obiektu typu TFD
	private TaskList taskList; //zawiera info do kt. listy należy zadanie

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

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER) //cascade - określa co ma się dziać z rekordami w tabeli zależnej (czyli TASKS_FINANCIALS)
	// w momencie, gdy usuwamy lub zapisujemy rekord w tabeli TASKS to automatycznie zostanie usunięty lub zapisany rekord w tabeli TASKS_FINANCIAL
	//fetch - określa czy podczas wczytywania encji Task z bazy danych mają być automatycznie odczytywane ("dociągane") wszystkie zależne rekordy z tabeli
	@JoinColumn(name="TASKS_FINANCIALS_ID")
	public TaskFinancialDetails getTaskFinancialDetails() {
		return taskFinancialDetails;
	}

	@ManyToOne
	@JoinColumn(name="TASKLIST_ID")
	public TaskList getTaskList() {
		return taskList;
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

	public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) { //musi być public - będziemy wywoływać go w testach
		this.taskFinancialDetails = taskFinancialDetails;
	}

	public void setTaskList(TaskList taskList) {
		this.taskList = taskList;
	}
}
