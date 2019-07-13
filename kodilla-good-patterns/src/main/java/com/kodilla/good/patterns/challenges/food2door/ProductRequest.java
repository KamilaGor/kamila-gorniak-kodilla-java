package com.kodilla.good.patterns.challenges.food2door;

public class ProductRequest {

	private Supplier supplier;
	private double quantity;
	private TypeOfProduct typeOfProduct;

	public ProductRequest(Supplier supplier, double quantity, TypeOfProduct typeOfProduct) {
		this.supplier = supplier;
		this.quantity = quantity;
		this.typeOfProduct = typeOfProduct;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public double getQuantity() {
		return quantity;
	}

	public TypeOfProduct getTypeOfProduct() {
		return typeOfProduct;
	}
}
