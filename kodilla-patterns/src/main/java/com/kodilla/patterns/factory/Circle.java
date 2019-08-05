package com.kodilla.patterns.factory;

public class Circle implements Shape{
	final String name;
	final double radius;

	public Circle(String name, double radius) { //konstruktor przyjmuje dwa paramety: nazwę i promien
		this.name = name;
		this.radius = radius;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0); //korzystamy ze stałej PI z biblioteki Math
	}
	@Override
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}
