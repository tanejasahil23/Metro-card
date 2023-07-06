package com.project.rest.service.metro.card;

public class CollectionSummry {
	private double totalAmountCollected;
	private double totalDiscountGiven;

	public void update(double fare, double discount) {
		totalAmountCollected += fare;
		totalDiscountGiven += discount;
	}

	public double getTotalAmountCollected() {
		return totalAmountCollected;
	}

	public double getTotalDiscountGiven() {
		return totalDiscountGiven;
	}
}
