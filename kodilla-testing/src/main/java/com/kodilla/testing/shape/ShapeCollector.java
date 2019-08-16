package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
	private Shape shape;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	//    public ShapeCollector (Shape shape) {
//        this.shape = shape;
//    }
//
	public void addFigure(Shape shape) {
		shapes.add(shape);
	}

	public int getFigureQuantity() {
		return shapes.size();
	}

	public boolean removeFigure(Shape shape) {
		boolean result = false;
		if (shapes.contains(shape)) {
			shapes.remove(shape);
			result = true;
		}
		return result;
	}

	public Shape getFigure(int shapeNumber) {
		Shape shape = null;
		if (shapeNumber >= 0 && shapeNumber < shapes.size()) {
			shape = shapes.get(shapeNumber);
		}
		return shape;
	}

	public ArrayList<Shape> showFigures() {
		for (int i = 0; i < shapes.size(); i++) {
			System.out.println(shapes.get(i).getShapeName());
		}
		return shapes;
	}
}
