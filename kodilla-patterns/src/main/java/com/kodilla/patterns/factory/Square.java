package com.kodilla.patterns.factory;

public final class Square implements Shape {
	final String name;
	final double width;

	public Square(String name, double width) { //dwa argumenty w konstruktorze
		this.name = name;
		this.width = width;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public double getArea() {
		return Math.pow(width, 2.0);
	}
	@Override
	public double getCircumference() {
		return 4 * width;
	}
}
