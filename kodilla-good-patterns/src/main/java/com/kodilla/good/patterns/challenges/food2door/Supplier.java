package com.kodilla.good.patterns.challenges.food2door;

public class Supplier {

	private String name;
	private String address;
	private String taxNumber;

	public Supplier(String name, String address, String taxNumber) {
		this.name = name;
		this.address = address;
		this.taxNumber = taxNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTaxNumber() {
		return taxNumber;
	}
}
