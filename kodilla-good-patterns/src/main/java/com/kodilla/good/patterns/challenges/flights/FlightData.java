package com.kodilla.good.patterns.challenges.flights;

import java.time.format.DateTimeFormatter;

public final class FlightData {

	private final String flight;
	private final String airportDepartures;
	private final String airportArrivals;
	private final String flightTime; // jak zapisać czas w formacie godziny

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
}
