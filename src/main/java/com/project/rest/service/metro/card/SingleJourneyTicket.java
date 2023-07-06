package com.project.rest.service.metro.card;

public class SingleJourneyTicket implements TicketFare {
	private Customer customer;

	public SingleJourneyTicket(Customer customer) {
		this.customer = customer;
	}

	@Override
	public double calculateFare() {
		switch (customer.getType()) {
		case ADULT:
			return 100;
		case SENIOR_CITIZEN:
			return 50;
		case CHILD:
			return 75;
		default:
			throw new IllegalArgumentException("Invalid customer type");
		}
	}

	@Override
	public double calculateDiscount() {
		return 0;
	}
}