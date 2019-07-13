package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderRepository implements OrderRepository {

	@Override
	public boolean createOrder(User user, LocalDateTime dateOfAcceptanceForProcessing, LocalDateTime dateOfOrder) {
		return false;
	}
}
