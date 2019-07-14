package com.kodilla.good.patterns.challenges.flights;

public class FlightServiceApp {

	public static void main (String[] args) {
		FlightConnection1 departures = new FlightConnection1();
		departures.getSet().stream()
				.filter(flight -> flight.getAirportDepartures().equals("Gdańsk"))
				.forEach(System.out::println);
		FlightConnection1 arrivals = new FlightConnection1();
		arrivals.getSet().stream()
				.filter(flight -> flight.getAirportArrivals().equals("Poznań"))
				.forEach(System.out::println);
		FlightConnection1 layover = new FlightConnection1(); //z Gdańska do Krakowa i z Krakwoa do Warszawy
		layover.getSet().stream()
				.filter(flight -> flight.getAirportDepartures().equals("Gdańsk") && flight.getAirportArrivals().equals("Kraków"))
						//&& flight.getAirportArrivals().equals("Warszawa"))
				.forEach(System.out::println);
	}
}
