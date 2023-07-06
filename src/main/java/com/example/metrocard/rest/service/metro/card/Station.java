package com.example.metrocard.rest.service.metro.card;

//Step 3: Define the Station class
public class Station {
	private String stationName;
	private CollectionSummry collectionSummary;

	public Station(String stationName, CollectionSummry collectionSummary) {
		this.stationName = stationName;
		this.collectionSummary = collectionSummary;
	}

	public void updateCollectionSummary(double fare, double discount) {
		collectionSummary.update(fare, discount);
	}
}
