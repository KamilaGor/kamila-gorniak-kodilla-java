package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
	@Autowired
	private TaskListDao taskListDao;

	@Test
	public void testTaskListDaoFindByListName() {
		//Given
		TaskList taskList = new TaskList("ListOne", "First task from the first list");
		taskListDao.save(taskList);
		String listName = taskList.getListName();
		//When
		List<TaskList> readTaskList = taskListDao.findByListName(listName);
		//Then
		Assert.assertEquals(1,readTaskList.size());
		System.out.println("Size readTaskList: " + readTaskList.size());
		//CleanUp
		int id = readTaskList.get(0).getId();
		taskListDao.deleteById(id);
		taskListDao.deleteAll();
	}
	@Test
	public void testTaskListDaoSaveWithTasks() {
		//Given
		Task task = new Task("Test: Learn Hibernate", 14);//newObiekt z kt. koresponduje tfd
		Task task2 = new Task("Test: Write some entities", 3);//newObiekt z kt. koresponduje tfd2
		TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
		TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
		task.setTaskFinancialDetails(tfd);//ustawienie obiektu tfd w obiekcie task
		task2.setTaskFinancialDetails(tfd2);
		TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");//newEntity
		taskList.getTasks().add(task);//doadanie nowego obiektu do listy
		taskList.getTasks().add(task2);
		task.setTaskList(taskList); //ustawienie obiektu taskList w obiekcie task
		task2.setTaskList(taskList);
		//When
		taskListDao.save(taskList);//zapsiuemy do b.d.  encje taskList przy pomocy kontrolera repozytorium
		int id = taskList.getId();// zapamiętujemy id, jakie zostało mu nadane przez Hibernate
		//Then
		Assert.assertNotEquals(0, id); //spr czy id zostało nadane
		//CleanUp
		taskListDao.deleteById(id); //sprzątamy
	}
}
