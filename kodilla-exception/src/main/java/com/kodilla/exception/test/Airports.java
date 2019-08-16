package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Airports {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = new HashMap<String, Boolean>();
        airportList.put("Okęcie", true);
        airportList.put("Ławica", false);
        airportList.put("Balice", true);
        airportList.put("Rębiechowo", false);

        String arrival1 = flight.getArrivalAirpot();
        String departure1 = flight.getDepartureAirport();

        if (airportList.containsKey(arrival1) && airportList.get(arrival1)
                && airportList.containsKey(departure1) && airportList.get(departure1)) {
            System.out.println("You can use this connection");
        } else {
            System.out.println("This connection doesn't exist");
            throw new RouteNotFoundException();
        }
    }
}
