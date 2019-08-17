package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
	@Autowired
	private TaskDao taskDao; //referencja do kontrolera repozytorium
	private static final String DESCRIPTION = "TEST: Learn Hibernate";

	@Test
	public void testTaskDaoSave() {
		//Given
		Task task = new Task(DESCRIPTION, 7);//tworzony jest obiekt klasy (ma wartość description ustawioną
		//przez stałą DESCRIPTION, a czas trwania ustawiony jest na 7 dni.

		//When - właściwy test-wywołanie met. save(T entity) interfejsu kontrolera repozytorium.
		// Oczekujemy, że po wykonaniu tej operacji w bazie danych zostanie zapisany obiekt task
		taskDao.save(task);

		//Then
		int id = task.getId(); // z kontrolera repozytorium pobieramy obiekt o wskazanym identyfikatorze
		Optional<Task> readTask = taskDao.findById(id); //metoda zwraca Optional&lt;Task&gt;
		Assert.assertTrue(readTask.isPresent());

		//CleanUp -do "posprzątania" po testach (testy są idempotentne
		// - czyli stan systemu po wykonaniu testu musi być taki sam jak przed wykonaniem testu
		taskDao.deleteById(id);
	}
	@Test
	public void testTaskDaoFindByDuration() {
		//Given
		Task task = new Task(DESCRIPTION, 7);// tworzymy obiekt task, którego wartość pola duration wynosi 7.
		taskDao.save(task);//Zapisujemy go w bazie danych i zapamiętujemy ile wynosi duration.
		int duration = task.getDuration();

		//When
		List<Task> readTasks = taskDao.findByDuration(duration); //wywołujemy testowaną metodę - findByDuration(int duration)

		//Then
		Assert.assertEquals(1, readTasks.size());//spr. czy zwrócony został dokładnie jeden rekord

		//CleanUp
		int id = readTasks.get(0).getId(); //sprzątamy po testach, czyli usuwamy dodany rekord
		taskDao.deleteById(id);
	}
}
