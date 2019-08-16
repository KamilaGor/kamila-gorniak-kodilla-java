package com.kodilla.stream.world;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {
	@Test
	public void testGetPeopleQuantity() {
		//Given
		World world = new World();
		Continent continent1 = new Continent();
		Continent continent2 = new Continent();
		Continent continent3 = new Continent();
		Country country1 = new Country("Country1", new BigDecimal("1000000"));
		Country country11 = new Country("Country11", new BigDecimal("1000000"));
		Country country2 = new Country("Country2", new BigDecimal("2000000000"));
		Country country22 = new Country("Country22", new BigDecimal("2000000000"));
		Country country3 = new Country("Country3", new BigDecimal("3000000000"));
		Country country33 = new Country("Country33", new BigDecimal("3000000000"));
		Country country333 = new Country("Country333", new BigDecimal("3000000000"));

		//When
		continent1.addCountry(country1);
		continent1.addCountry(country11);
		continent2.addCountry(country2);
		continent2.addCountry(country22);
		continent3.addCountry(country3);
		continent3.addCountry(country33);
		continent3.addCountry(country333);
		world.addContinent(continent1);
		world.addContinent(continent2);
		world.addContinent(continent2);

		//Then
		BigDecimal allPeople = new BigDecimal("8002000000");
		Assert.assertEquals(allPeople, world.getPeopleQuantity());
	}
}
