package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
	@Test
	public void testBigmacNew() {
		//Given
		Bigmac bigmac = new Bigmac.BigmacBuilder()
				.bun("classic")
				.burgers(2)
				.sauce("barbecue")
				.ingredient("lettuce")
				.ingredient("onion")
				.ingredient("bacon")
				.ingredient("mushrooms")
				.ingredient("shrimps")
				.make();
		System.out.println(bigmac);
		//When
		int howManyIngredients = bigmac.getIngredients().size();
		int howManyBurgers = bigmac.getBurgers();
		String whatSauce = bigmac.getSauce();
		//Then
		Assert.assertEquals(5, howManyIngredients);
		Assert.assertEquals(2, howManyBurgers);
		Assert.assertEquals("barbecue", whatSauce);
	}
}
