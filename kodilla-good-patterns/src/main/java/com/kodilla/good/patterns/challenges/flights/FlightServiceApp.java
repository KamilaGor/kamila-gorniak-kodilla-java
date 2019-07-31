package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightServiceApp {

	public static void main(String[] args) {
		System.out.println("Wyloty z Gdańska:");
		FlightConnection1 departures = new FlightConnection1();
		departures.getSet().stream()
				.filter(flight -> flight.getAirportDepartures().equals("Gdańsk"))
				.forEach(System.out::println);
		System.out.println("Lądowanie w Poznaniu: ");
		FlightConnection1 arrivals = new FlightConnection1();
		arrivals.getSet().stream()
				.filter(flight -> flight.getAirportArrivals().equals("Poznań"))
				.forEach(System.out::println);
		System.out.println("Międzylądowanie:");
	}
}
