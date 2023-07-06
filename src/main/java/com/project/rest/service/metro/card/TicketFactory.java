package com.project.rest.service.metro.card;

public class TicketFactory {
	public static TicketFare createTicket(Customer customer, JourneyType journeyType) {

		if (journeyType.equals(JourneyType.SINGLE)) {
			switch (customer.getType()) {
			case ADULT:
				return new AdultCustomerTicket(customer);
			case CHILD:
				return new ChildCustomerTicket(customer);
			case SENIOR_CITIZEN:
				return new SeniorCitizenCustomerTicket(customer);
			default:
				throw new IllegalArgumentException("Invalid customer type");
			}
		} else if (journeyType.equals(JourneyType.RETURN)) {
			return new ReturnJourneyTicket(customer);
		} else {
			throw new IllegalArgumentException("Invalid customer type");
		}
	}
}