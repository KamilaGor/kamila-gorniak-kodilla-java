package com.kodilla.patterns.factory;

public final class ShapeFactory {
	public static final String CIRCLE = "Circle"; //definicja stałych, których używamy do wywołania metody makeShape(final String className)
	public static final String SQUARE = "Square";
	public static final String RECTANGLE = "Rectangle";

	public final Shape makeShape(final String shapeClass) { //spr, której ze stałych użyto podczas wywołania i tworzy
		// odpowiadający stałej obiekt(okrąg, kwadrat, prostokąt; wszytkie implementują interface Shape -> typ zwracany przez met. = Shape
		switch (shapeClass) {
			case CIRCLE:
				return new Circle("The rounded circle", 4.5);
			case SQUARE:
				return new Square("The angular square", 7.0);
			case RECTANGLE:
				return new Rectangle("The long rectangle", 15.0, 2.5);
			default:
				return null;
		}
	}
}
