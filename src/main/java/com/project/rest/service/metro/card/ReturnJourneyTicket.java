package com.project.rest.service.metro.card;

public class ReturnJourneyTicket implements TicketFare {
	private Customer passenger;

	public ReturnJourneyTicket(Customer passenger) {
		this.passenger = passenger;
	}

	@Override
	public double calculateFare() {
		return new SingleJourneyTicket(passenger).calculateFare() * 2;
	}

	@Override
	public double calculateDiscount() {
		return new SingleJourneyTicket(passenger).calculateFare() * 0.5;
	}
}
