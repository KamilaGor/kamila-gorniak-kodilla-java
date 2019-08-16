package com.kodilla.patterns.factory;

public final class Rectangle implements Shape {
	final String name;
	final double width;
	final double length;

	public Rectangle(String name, double width, double length) { // 3 argumenty w konstruktorze
		this.name = name;
		this.width = width;
		this.length = length;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getCircumference() {
		return 2 * width + 2 * length;
	}
}
