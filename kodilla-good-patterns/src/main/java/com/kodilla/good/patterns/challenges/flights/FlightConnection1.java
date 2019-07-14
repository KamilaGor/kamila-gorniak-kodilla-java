package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public final class FlightConnection1 {

	private final Set<FlightData> flightConnectionSet = new HashSet<>();

	public FlightConnection1() {
		flightConnectionSet.add(new FlightData("GDN001", "Gdańsk", "Wrocław", "2:15"));
		flightConnectionSet.add(new FlightData("GDN011", "Gdańsk", "Kraków", "2:22"));
		flightConnectionSet.add(new FlightData("GDN111", "Gdańsk", "Poznań", "1:30"));
		flightConnectionSet.add(new FlightData("RZE002", "Rzeszów", "Poznań", "2:07"));
		flightConnectionSet.add(new FlightData("RZE022", "Rzeszów", "Katowice", "1:27"));
		flightConnectionSet.add(new FlightData("RZE222", "Rzeszów", "Łódź", "1:17"));
		flightConnectionSet.add(new FlightData("KRK003", "Kraków", "Warszawa", "1:25"));
		flightConnectionSet.add(new FlightData("KRK033", "Kraków", "Poznań", "1:45"));
	}
	public Set<FlightData> getSet() {
		return new HashSet<>(flightConnectionSet);
	}

}
