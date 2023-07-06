package com.example.metrocard.rest.service.metro.card;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summary {
	private Map<CustomerType, Integer> mapByTypeAndNo;

	public Summary() {
		mapByTypeAndNo = new LinkedHashMap<>();
	}

	public void update(Customer passenger) {
		mapByTypeAndNo.put(passenger.getType(), mapByTypeAndNo.getOrDefault(passenger.getType(), 0) + 1);
	}

	public void printSummary() {
		Stream<Entry<CustomerType, Integer>> res1 = mapByTypeAndNo.entrySet().stream().sorted((c1, c2) -> {

			return c1.getKey().compareTo(c2.getKey());
		});
		Map<CustomerType, Integer> res = res1
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

		res.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

	}
}