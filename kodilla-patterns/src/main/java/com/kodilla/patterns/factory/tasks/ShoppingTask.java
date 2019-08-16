package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
	final String taskName;
	final String whatToBuy;
	final double quantity;
	boolean isTaskExecuted = false;

	public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
		this.taskName = taskName;
		this.whatToBuy = whatToBuy;
		this.quantity = quantity;

	}

	@Override
	public void executeTask() {
		this.isTaskExecuted = true;
		System.out.println("Shopping task done!");
	}

	@Override
	public String getTaskName() {
		return taskName;
	}

	@Override
	public boolean isTaskExecuted() {
		return isTaskExecuted;
	}
}
