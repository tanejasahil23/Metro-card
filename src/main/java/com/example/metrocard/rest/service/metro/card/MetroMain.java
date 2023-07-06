package com.example.metrocard.rest.service.metro.card;

public class MetroMain {
	public static void main(String[] args) {
		CollectionSummry collectionSummary = new CollectionSummry();
		Summary summary = new Summary();

		Station centralStation = new Station("Huda City Center", collectionSummary);

		Customer customer1 = new Customer("Ankit", 30, CustomerType.ADULT);
		Customer customer2 = new Customer("Surbhi", 65, CustomerType.SENIOR_CITIZEN);
		Customer customer3 = new Customer("Akshit", 12, CustomerType.CHILD);

		customer1(summary, centralStation, customer1);

		customer2(summary, centralStation, customer2);

		customer3(summary, centralStation, customer3);

		// Print collection summary
		System.out.println("Collection Summary Amount:");
		System.out.println("Total amount collected: " + collectionSummary.getTotalAmountCollected());
		System.out.println("Total discount given: " + collectionSummary.getTotalDiscountGiven());

		// Print customer summary
		System.out.println("customer information in sorting format:");
		summary.printSummary();
	}

	private static void customer3(Summary summary, Station centralStation, Customer customer3) {
		// customer 3 journey
		MetroCard metroCard3 = new MetroCard(345678, 80);
		TicketFare ticket3 = TicketFactory.createTicket(customer3, JourneyType.SINGLE);
		calculation(summary, centralStation, customer3, metroCard3, ticket3);
	}

	private static void calculation(Summary summary, Station centralStation, Customer customer3, MetroCard metroCard3,
			TicketFare ticket3) {
		double fare3 = ticket3.calculateFare();

		double discount3 = ticket3.calculateDiscount();

		if (fare3 > metroCard3.getBalance()) {
			double rechargeAmount = fare3 - metroCard3.getBalance();
			metroCard3.rechargeCard(rechargeAmount * 1.02); // Recharge with 2% service fee
		}
		metroCard3.deductFare(fare3);
		centralStation.updateCollectionSummary(fare3, discount3);
		summary.update(customer3);
	}

	private static void customer2(Summary summary, Station centralStation, Customer customer2) {
		MetroCard metroCard2 = new MetroCard(234567, 100);
		TicketFare ticket2 = TicketFactory.createTicket(customer2, JourneyType.RETURN);
		calculation(summary, centralStation, customer2, metroCard2, ticket2);

	}

	private static void customer1(Summary summary, Station centralStation, Customer customer1) {
		MetroCard metroCard1 = new MetroCard(123456, 50);
		TicketFare ticket1 = TicketFactory.createTicket(customer1, JourneyType.SINGLE);
		calculation(summary, centralStation, customer1, metroCard1, ticket1);
	}
}
