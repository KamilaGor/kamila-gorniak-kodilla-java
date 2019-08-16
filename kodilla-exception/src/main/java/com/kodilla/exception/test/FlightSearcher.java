package com.kodilla.exception.test;

public class FlightSearcher {

    public static void main(String[] args) {
        Flight flight = new Flight("Okęcie", "Balice1");
        Airports airports = new Airports();
        try {
            airports.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
