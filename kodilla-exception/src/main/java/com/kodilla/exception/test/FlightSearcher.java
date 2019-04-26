package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public static void main(String[] args) {
        Flight flight = new Flight("Okęcie", "Balice");
        Airports airports = new Airports();
        try {
            airports.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);

        }

    }

}
