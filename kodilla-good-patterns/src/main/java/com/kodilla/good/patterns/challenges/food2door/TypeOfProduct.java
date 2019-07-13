package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class TypeOfProduct {

	private String name;
	private String size;
	private LocalDateTime useByDate;

	public TypeOfProduct(String name, String size, LocalDateTime useByDate) {
		this.name = name;
		this.size = size;
		this.useByDate = useByDate;
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public LocalDateTime getUseByDate() {
		return useByDate;
	}
}
