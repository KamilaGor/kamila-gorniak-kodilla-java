//package com.kodilla.good.patterns.challenges.flights;
//
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class FlightConnetction {
//
//	public Set flightConnectionRetrieve() {
//
//		FlightData flightGDN001 = new FlightData("GDN001", "Gdańsk", "Wrocław", "2:15");
//		FlightData flightGDN011 = new FlightData("GDN011", "Gdańsk", "Kraków", "2:22");
//		FlightData flightGDN111 = new FlightData("GDN111", "Gdańsk", "Poznań", "1:30");
//		FlightData flightRZE002 = new FlightData("RZE002", "Rzeszów", "Poznań", "2:07");
//		FlightData flightRZE022 = new FlightData("RZE022", "Rzeszów", "Katowice", "1:27");
//		FlightData flightRZE222 = new FlightData("RZE222", "Rzeszów", "Łódź", "1:17");
//
//		Set<FlightData> flightConnectionsSet = new HashSet<>();
//		flightConnectionsSet.add(flightGDN001);
//		flightConnectionsSet.add(flightGDN011);
//		flightConnectionsSet.add(flightGDN111);
//		flightConnectionsSet.add(flightRZE002);
//		flightConnectionsSet.add(flightRZE022);
//		flightConnectionsSet.add(flightRZE222);
//
//		return new HashSet<>(flightConnectionsSet);
//	}
//}
