package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class ProductRequestRetriever {

	public ProductRequest retrieve() {
		Supplier supplier1 = new Supplier("ExtraFoodShop", "ul. Jantarowa 5, 08-300 Lublin, Polska", "001-33-55");
		double quantity = 18.00;
		TypeOfProduct type1 = new TypeOfProduct("Mango", "1 szt.", LocalDateTime.of(2020, 10, 10, 12, 00));

		return new ProductRequest(supplier1, quantity, type1);
	}
}
