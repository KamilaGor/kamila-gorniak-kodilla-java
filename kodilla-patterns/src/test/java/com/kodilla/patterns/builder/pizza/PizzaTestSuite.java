package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
	@Test
	public void testPizzaNew() {
		//Given
		Pizza pizza = new Pizza.PizzaBuilder()
				.ingredient("Onion") //argumenty można podawać w dowolnej kolejności(a opconalnych nie musimy podawać w ogóle
				.bottom("Thin")
				.sauce("spicy")
				.ingredient("Ham")
				.ingredient("Mushrooms")
				.build();
		System.out.println(pizza);
		//When
		int howManyIngredients = pizza.getIngredients().size();
		//Then
		Assert.assertEquals(3, howManyIngredients);
	}
}
