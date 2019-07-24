package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
	//Utwórz też test testTaskAdd(), który doda do każdej z list po jednym zadaniu (wcześniej uzyskując dostęp do Beana klasy Board).
	//Test powinien sprawdzać czy dodane zadania da się odczytać.
	@Test
	public void testTaskAdd() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Board board = context.getBean(Board.class);
		//When
		board.getToDoList().addTask("task1");
		board.getInProgressList().addTask("task2");
		board.getDoneList().addTask("task3");
		//Then
		Assert.assertTrue(board.getToDoList().getTasks().contains("task1"));
		Assert.assertTrue(board.getInProgressList().getTasks().contains("task2"));
		Assert.assertTrue(board.getDoneList().getTasks().contains("task3"));
	}
}


