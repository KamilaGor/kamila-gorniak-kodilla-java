package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

	private User user;
	private LocalDateTime dateOfOrder;
	private LocalDateTime dateOfAcceptanceForProcessing;

	public OrderRequest (final User user, final LocalDateTime dateOfOrder, final LocalDateTime dateOfAcceptanceForProcessing) {
		this.user = user;
		this.dateOfOrder = dateOfOrder;
		this.dateOfAcceptanceForProcessing = dateOfAcceptanceForProcessing;
	}

	public User getUser() {
		return user;
	}
	public LocalDateTime getDateOfOrder() {
		return dateOfOrder;
	}
	public LocalDateTime getDateOfAcceptanceForProcessing() {
		return dateOfAcceptanceForProcessing;
	}
}
