package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindAirport {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Warsaw", true);
        airport.put("London", true);
        airport.put("Pekin", false);
        airport.put("Poznan", false);
        airport.put("Moscow", true);

        if (airport.get(flight.getArrivalAirport())) {
            System.out.println("You can fly to " + flight.getArrivalAirport() + ".");
        } else {
            throw new RouteNotFoundException("You can't fly.");
        }
    }
}
