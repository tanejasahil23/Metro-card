package com.project.rest.service.metro.card;

public class MetroCard {
	private Integer cardNo;
	private double balance;

	public MetroCard(Integer cardNumber, double balance) {
		this.cardNo = cardNumber;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public Integer getCardNo() {
		return cardNo;
	}

	public void rechargeCard(double amount) {
		balance += amount;
	}

	public void deductFare(double amount) {
		balance -= amount;
	}
}