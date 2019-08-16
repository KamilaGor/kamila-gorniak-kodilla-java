package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
	public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

		ArrayList<Integer> numbers2 = new ArrayList<>();

		for (Integer theNumber : numbers) {
			if (theNumber % 2 == 0) {
				numbers2.add(theNumber);
			}
		}
		return numbers2;
	}
}

