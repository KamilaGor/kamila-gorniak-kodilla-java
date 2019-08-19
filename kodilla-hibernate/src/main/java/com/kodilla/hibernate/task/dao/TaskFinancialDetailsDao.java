package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
	List<TaskFinancialDetails> findByPaid(boolean paid); //udostępnia wszystkie met CrudRepository + findByPaid,
	//która zwraca listę obiektów TaskFinancialDetails, dla których pole paid ustawione
	// jest na wartość określoną parametrem metody paid.
}
