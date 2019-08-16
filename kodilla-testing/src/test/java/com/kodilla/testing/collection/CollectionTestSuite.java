package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
	@Before
	public void before() {
		System.out.println("Test Case: begin");
	}

	@After
	public void after() {
		System.out.println("Test Case: end");
	}

	@Test
	public void testOddNumbersExterminatorEmptyList() {
		//Given
		OddNumbersExterminator exterminator = new OddNumbersExterminator();
		//When
		ArrayList<Integer> theList = new ArrayList<>();
		ArrayList<Integer> oddNumber = exterminator.exterminate(theList);
		for (Integer theOddNumber : oddNumber) {
			System.out.println(theOddNumber);
		}
		//Then
		Assert.assertEquals(0, theList.size());
		System.out.println("Empty list !");
	}

	@Test
	public void testOddNumbersExterminatorNormalList() {
		//Given
		OddNumbersExterminator exterminator = new OddNumbersExterminator();
		//When
		ArrayList<Integer> theList = new ArrayList<>();
		theList.add(3);
		theList.add(4);
		ArrayList<Integer> result = exterminator.exterminate(theList);
		ArrayList<Integer> odd = new ArrayList<>();
		odd.add(4);
		// Then
		Assert.assertEquals(odd, result);
		System.out.println("Result of exterminate method: " + result);
		System.out.println("Expected value: " + odd);
	}
}
