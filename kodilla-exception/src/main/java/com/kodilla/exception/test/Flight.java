package com.kodilla.exception.test;

public class Flight {
    private String departureAirport;
    private String arrivalAirpot;

    public Flight(String departureAirport, String arrivalAirpot) {
        this.departureAirport = departureAirport;
        this.arrivalAirpot = arrivalAirpot;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirpot() {
        return arrivalAirpot;
    }
}
