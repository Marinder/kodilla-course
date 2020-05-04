package com.kodilla.good.patterns.flight;

import java.util.Set;

public class Application {
    public static void main (String[] args) {
        FlightList flightList = new FlightList();
        Set<Flight> theFlightList = flightList.getTheFlightList();
        FlightService flightService = new FlightService();
        flightService.fromAirport(theFlightList, "Moscow");
        flightService.toAirport(theFlightList, "Berlin");
        flightService.viaAirport(theFlightList,"London", "Poznan", "Pekin");
    }
}
