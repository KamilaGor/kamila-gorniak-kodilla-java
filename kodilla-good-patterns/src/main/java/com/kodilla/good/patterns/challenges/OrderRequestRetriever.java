package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

	public OrderRequest retrieve() {

		User user = new User("Kamila", "Gorniak");

		LocalDateTime dateOfOrder = LocalDateTime.of(2019, 7, 1, 9, 33);
		LocalDateTime dateOfAcceptanceForProcessing = LocalDateTime.of(2019, 7, 1, 12, 59);

		return new OrderRequest(user, dateOfOrder, dateOfAcceptanceForProcessing);
	}
}
