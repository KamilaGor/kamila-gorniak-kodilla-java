package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
	final String taskName;
	final String color;
	final String whatToPaint;
	boolean isTaskExecuted = false;

	public PaintingTask(final String taskName, final String color, final String whatToPaint) {
		this.taskName = taskName;
		this.color = color;
		this.whatToPaint = whatToPaint;
	}
	@Override
	public void executeTask() {
		this.isTaskExecuted = true;
		System.out.println("Painting task done !");
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
