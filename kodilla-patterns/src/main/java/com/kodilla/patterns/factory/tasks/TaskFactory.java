package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
	public static final String SHOPPINGTASK = "Shopping task";
	public static final String PAINTINGTASK = "Painting task";
	public static final String DRIVINGTASK = "Driving task";

	public final Task doTask(final String taskClass) {
		switch (taskClass) {
			case SHOPPINGTASK:
				return new ShoppingTask("Food", "Milk", 1.0);
			case PAINTINGTASK:
				return new PaintingTask("Landscape", "varicolored", "Forest");
			case DRIVINGTASK:
				return new DrivingTask("Pick up mom", "from hospital", "fiat");
			default:
				return null;
		}
	}
}
