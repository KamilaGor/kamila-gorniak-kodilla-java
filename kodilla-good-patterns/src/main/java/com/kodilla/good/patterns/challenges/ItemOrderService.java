package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderService implements OrderService {

	@Override
	public boolean order(User user, LocalDateTime dateOfAcceptanceForProcessing, LocalDateTime dateOfOrder) {
		return true;
	}
}
