//package com.kodilla.spring.portfolio;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class BoardConfig {
//	//Napisz klasę konfigurującą Beany o nazwie BoardConfig, która utworzy trzy różne Beany
//	//reprezentujące listy zadań i wstrzyknie je do Beana klasy Board.
//	@Bean
//	public Board board() {
//		return new Board(toDoList(), inProgressList(), doneList());
//	}
//	@Bean(name = "toDoList")
//	@Scope("prototype")
//	public TaskList toDoList() {
//		return new TaskList();
//	}
//	@Bean (name = "inProgressList")
//	@Scope("prototype")
//	public TaskList inProgressList() {
//		return new TaskList();
//	}
//	@Bean(name = "doneList")
//	@Scope("prototype")
//	public TaskList doneList() {
//		return new TaskList();
//	}
//}
