package com.example.metrocard.rest.service.metro.card;

public class Customer {
	private String name;
	private int age;
	private CustomerType type;

	public Customer(String name, int age, CustomerType type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public CustomerType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}