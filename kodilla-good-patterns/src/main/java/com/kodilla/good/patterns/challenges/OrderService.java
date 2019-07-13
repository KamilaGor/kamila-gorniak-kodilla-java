package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

	public boolean order (User user, LocalDateTime dateOfAcceptanceForProcessing, LocalDateTime dateOfOrder);

}
