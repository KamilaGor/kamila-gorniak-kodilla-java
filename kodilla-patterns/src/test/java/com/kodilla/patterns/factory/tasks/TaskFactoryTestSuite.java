package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
	@Test
	public void testShoppingTask() {
		//Given
		TaskFactory factory = new TaskFactory();
		//When
		Task shoppingTask = factory.doTask(TaskFactory.SHOPPINGTASK);
		shoppingTask.executeTask();
		//Then
		Assert.assertEquals(true, shoppingTask.isTaskExecuted());
		Assert.assertEquals("Food", shoppingTask.getTaskName());
	}

	@Test
	public void testPaintingTask() {
		//Given
		TaskFactory factory = new TaskFactory();
		//When
		Task paintingTask = factory.doTask(TaskFactory.PAINTINGTASK);
		paintingTask.executeTask();
		//Then
		Assert.assertEquals(true, paintingTask.isTaskExecuted());
		Assert.assertEquals("Landscape", paintingTask.getTaskName());
	}

	@Test
	public void testDrivingTask() {
		//Given
		TaskFactory factory = new TaskFactory();
		//When
		Task drivingTask = factory.doTask(TaskFactory.DRIVINGTASK);
		drivingTask.executeTask();
		//Then
		Assert.assertNotEquals(false, drivingTask.isTaskExecuted());
		Assert.assertEquals("Pick up mom", drivingTask.getTaskName());
	}
}
