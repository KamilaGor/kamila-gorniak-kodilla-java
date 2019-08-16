package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
	private static int testCounter = 0; //numerator testów

	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("This is the beginning of tests.");
	}

	@AfterClass
	public static void afterAllTests() {
		System.out.println("All tests are finished.");
	}

	@Before
	public void beforeEveryTest() {
		testCounter++;
		System.out.println("Preparing to execute test #" + testCounter);
	}

	@Test // 1.sprawdza czy po dodaniu trzech figur, liczba figur w arrayList wynosi 3
	public void testAddFigure() {
		//Given
		Circle circle = new Circle("circle", "10");
		ShapeCollector shapeCollector = new ShapeCollector();
		// When
		shapeCollector.addFigure(circle);
		//Then
		Assert.assertEquals(1, shapeCollector.getFigureQuantity());
	}

	@Test
	public void testRemoveFigure() {
		//Given
		Circle circle = new Circle("circle", "10");
		ShapeCollector shapeCollector = new ShapeCollector();
		shapeCollector.addFigure(circle);
		// When
		boolean result = shapeCollector.removeFigure(circle);
		//Then
		Assert.assertTrue(result);
		Assert.assertEquals(0, shapeCollector.getFigureQuantity());
	}

	@Test //3.sprawdza czy została pobrana z kolekcji figura z pozycji n listy
	public void testGetFigure() {
		//Given
		Circle circle = new Circle("circle", "10");
		ShapeCollector shapeCollector = new ShapeCollector();
		shapeCollector.addFigure(circle);
		//When
		Shape retrievedShape; //zmienna lokalna, po to, żeby tego samego rodzaju był assert
		retrievedShape = shapeCollector.getFigure(0);
		//Then
		Assert.assertEquals(circle, retrievedShape);
	}
//    @Test // 4. wyświetla wszystkie elementy
//    public void testShowFigures() {
//        //Given
//        Circle circle = new Circle("circle", "10");
//        ShapeCollector shapeCollector = new ShapeCollector();
//        shapeCollector.addFigure(circle);
//        //When
//        ArrayList<Shape> theShapes = new ArrayList<>();
//        theShapes.add(circle);
//        //Then
//        Assert.assertEquals(theShapes.toArray(), shapeCollector.showFigures().toArray());
//    }
}




