package com.kodilla.good.patterns.challenges.flights;

import java.security.cert.CollectionCertStoreParameters;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class FlightData {

	private final String flight;
	private final String airportDepartures;
	private final String airportArrivals;
	private final String flightTime;

	public FlightData(final String flight, final String airportDepartures, final String airportArrivals, final String flightTime) {
		this.flight = flight;
		this.airportDepartures = airportDepartures;
		this.airportArrivals = airportArrivals;
		this.flightTime = flightTime;
	}

	public String getFlight() {
		return flight;
	}

	public String getAirportDepartures() {
		return airportDepartures;
	}

	public String getAirportArrivals() {
		return airportArrivals;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public String getFlightFromViaTo(final String airportDepartures, final String airportArrivals) {
		FlightConnection1 flightConnection1 = new FlightConnection1();
		Set<FlightConnection1> set = flightConnection1.getSet().stream()
				.filter(n ->n.getAirportDepartures().equals("Gdańsk"))
				.collect(Collectors.toSet());
		Set<FlightConnection1> set1 =flightConnection1.getSet().stream()
				.filter(n-> n.getAirportArrivals().equals("Warszawa"))
				.collect(Collectors.toSet());
		return "You can fly from " + airportDepartures + "to " + airportArrivals + "via: \n" + set.stream()
				.map(n -> n.getAirportDepartures())
				.filter(n -> n.set1.stream()
						.map(x -> x.getAirportDepartures())
						.collect(Collectors.toSet())
						.contains("Kraków"))
				.collect(Collectors.joining("\n"));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		FlightData that = (FlightData) o;

		if (flight != null ? !flight.equals(that.flight) : that.flight != null) return false;
		if (airportDepartures != null ? !airportDepartures.equals(that.airportDepartures) : that.airportDepartures != null)
			return false;
		if (airportArrivals != null ? !airportArrivals.equals(that.airportArrivals) : that.airportArrivals != null)
			return false;
		return flightTime != null ? flightTime.equals(that.flightTime) : that.flightTime == null;
	}

	@Override
	public int hashCode() {
		int result = flight != null ? flight.hashCode() : 0;
		result = 31 * result + (airportDepartures != null ? airportDepartures.hashCode() : 0);
		result = 31 * result + (airportArrivals != null ? airportArrivals.hashCode() : 0);
		result = 31 * result + (flightTime != null ? flightTime.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "FlightData{" +
				"flight='" + flight + '\'' +
				", airportDepartures='" + airportDepartures + '\'' +
				", airportArrivals='" + airportArrivals + '\'' +
				", flightTime='" + flightTime + '\'' +
				'}';
	}
}
